package w91;

/* loaded from: classes13.dex */
public class k extends w91.f {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f444070f;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str, str2);
        this.f444070f = str3;
        c("SOAPACTION", "\"" + str2 + "#" + this.f444064b + "\"");
        d();
    }

    @Override // w91.d
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"><s:Body>");
        java.lang.String replace = this.f444070f.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;").replace(" ", "&nbsp;").replace("'", "&apos;");
        sb6.append("<u:" + this.f444064b + " xmlns:u=\"" + this.f444066d + "\">\n<InstanceID>0</InstanceID>\n<CurrentURI>" + replace + "</CurrentURI>\n<CurrentURIMetaData>" + ("&lt;DIDL-Lite xmlns=&quot;urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/&quot; xmlns:upnp=&quot;urn:schemas-upnp-org:metadata-1-0/upnp/&quot; xmlns:dc=&quot;http://purl.org/dc/elements/1.1/&quot; xmlns:sec=&quot;http://www.sec.co.kr/&quot;&gt;&lt;item id=&quot;123&quot; parentID=&quot;-1&quot; restricted=&quot;1&quot;&gt;&lt;upnp:storageMedium&gt;UNKNOWN&lt;/upnp:storageMedium&gt;&lt;upnp:writeStatus&gt;UNKNOWN&lt;/upnp:writeStatus&gt;&lt;dc:title&gt;Video&lt;/dc:title&gt;&lt;dc:creator&gt;QGame&lt;/dc:creator&gt;&lt;upnp:class&gt;object.item.videoItem&lt;/upnp:class&gt;&lt;res protocolInfo=&quot;http-get:*:video/*:DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=01700000000000000000000000000000&quot;&gt;" + replace.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;").replace(" ", "&nbsp;").replace("'", "&apos;") + "&lt;/res&gt;&lt;/item&gt;&lt;/DIDL-Lite&gt;") + "</CurrentURIMetaData>\n</u:SetAVTransportURI>\n");
        sb6.append("</s:Body></s:Envelope>");
        return sb6.toString();
    }

    @Override // w91.f
    public java.lang.String b() {
        return "SetAVTransportURI";
    }
}
