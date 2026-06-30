package ui3;

/* loaded from: classes5.dex */
public class b extends dm.e8 {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f428113x = dm.e8.initAutoDBInfo(ui3.b.class);

    public java.lang.Object clone() {
        ui3.b bVar = new ui3.b();
        try {
            bVar.systemRowid = this.systemRowid;
            bVar.field_msgId = this.field_msgId;
            bVar.field_msgSvrId = this.field_msgSvrId;
            bVar.field_quotedMsgId = this.field_quotedMsgId;
            bVar.field_quotedMsgSvrId = this.field_quotedMsgSvrId;
            bVar.field_status = this.field_status;
            bVar.field_quotedMsgTalker = this.field_quotedMsgTalker;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.MsgQute", "clone() Exception:%s %s", e17.getClass(), e17.getMessage());
        }
        return bVar;
    }

    @Override // dm.e8, l75.f0
    public l75.e0 getDBInfo() {
        return f428113x;
    }

    public java.lang.String toString() {
        return "MsgQute{field_msgId=" + this.field_msgId + ", field_msgSvrId=" + this.field_msgSvrId + ", field_quotedMsgId=" + this.field_quotedMsgId + ", field_quotedMsgSvrId=" + this.field_quotedMsgSvrId + ", field_status=" + this.field_status + ", systemRowid=" + this.systemRowid + ", field_quotedMsgTalker=" + this.field_quotedMsgTalker + '}';
    }
}
