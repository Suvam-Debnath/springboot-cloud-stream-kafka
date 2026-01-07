<h1>🚀 Kafka Producer–Consumer Application (Spring Boot)</h1>

<p>
This is a <b>basic Apache Kafka Producer and Consumer application</b> built using
<b>Spring Boot</b> and <b>Spring Cloud Stream</b>.  
The application demonstrates <b>asynchronous, event-driven communication</b> between
microservices ⚡.
</p>

<hr/>

<h2>✨ 📌 Features</h2>
<ul>
  <li>📤 Kafka Producer using Spring Cloud Stream</li>
  <li>📥 Kafka Consumer using Spring Cloud Stream</li>
  <li>🧾 JSON-based message communication</li>
  <li>⚙️ Spring Boot auto-configuration</li>
  <li>🧩 Lightweight and easy to extend</li>
</ul>

<hr/>

<h2>📨 📍 Message Structure</h2>

<p>The producer sends the following <b>rider location payload</b> to Kafka:</p>

<pre>
{
  "riderId": "R123",
  "latitude": 22.5726,
  "longitude": 88.3639
}
</pre>

<table border="1" cellpadding="8" cellspacing="0">
  <tr>
    <th>🔑 Field</th>
    <th>📘 Type</th>
    <th>📝 Description</th>
  </tr>
  <tr>
    <td>riderId</td>
    <td>String</td>
    <td>Unique identifier for the rider</td>
  </tr>
  <tr>
    <td>latitude</td>
    <td>double</td>
    <td>Current latitude location of the rider</td>
  </tr>
  <tr>
    <td>longitude</td>
    <td>double</td>
    <td>Current longitude location of the rider</td>
  </tr>
</table>

<hr/>

<h2>🛠️ ⚙️ Technologies Used</h2>
<ul>
  <li>☕ Java</li>
  <li>🌱 Spring Boot</li>
  <li>☁️ Spring Cloud Stream</li>
  <li>🧵 Apache Kafka</li>
  <li>📦 Maven</li>
</ul>

<hr/>

<h2>🏗️ 🧩 Architecture</h2>
<ul>
  <li>📤 <b>Producer Service</b>: Publishes rider location data to Kafka topics</li>
  <li>🧵 <b>Kafka Broker</b>: Handles message streaming</li>
  <li>📥 <b>Consumer Service</b>: Consumes and processes rider location messages</li>
</ul>

<hr/>

<h2>▶️ ▶️ How to Run</h2>

<ol>
  <li>🧩 Start Kafka and Zookeeper</li>
  <li>⚙️ Configure Kafka properties in <code>application.yml</code> or <code>application.properties</code></li>
  <li>🚀 Run the Spring Boot application</li>
  <li>📤 Send messages from Producer</li>
  <li>📜 Verify message consumption in Consumer logs</li>
</ol>

<hr/>

<h2>📈 🚀 Use Cases</h2>
<ul>
  <li>📍 Live location tracking</li>
  <li>🔁 Event-driven microservices</li>
  <li>⚡ Real-time data streaming</li>
</ul>

<hr/>

<h2>📈 🚀 Output demo</h2>
<ul>
  <li>Producer</li>
  <img width="1920" height="1020" alt="kafka stream producer " src="https://github.com/user-attachments/assets/660170fe-ff25-4bed-9dd0-d3fd041d9230" />

  <li>Consumer</li>
  <img width="1920" height="1020" alt="kafka stream consumer" src="https://github.com/user-attachments/assets/fdf0f027-bf5b-4332-a5d5-03179c79d7c2" />

</ul>
