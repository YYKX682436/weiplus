package qk;

/* loaded from: classes8.dex */
public class h6 extends dm.h5 implements l23.a {

    /* renamed from: p1, reason: collision with root package name */
    public static final l75.e0 f364150p1 = dm.h5.initAutoDBInfo(qk.h6.class);

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof qk.h6)) {
            return false;
        }
        qk.h6 h6Var = (qk.h6) obj;
        return h6Var.field_functionmsgid.equals(this.field_functionmsgid) && h6Var.systemRowid == this.systemRowid;
    }

    @Override // dm.h5, l75.f0
    public l75.e0 getDBInfo() {
        return f364150p1;
    }

    public int hashCode() {
        return this.field_functionmsgid.hashCode();
    }

    public java.util.LinkedList t0() {
        r45.l4 l4Var = this.field_addMsgs;
        return l4Var == null ? new java.util.LinkedList() : l4Var.f379121d;
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_cgi)) {
            java.lang.String[] split = this.field_cgi.split("/");
            if (split.length > 0) {
                str = split[split.length - 1];
                return "FunctionMsgItem{cgi='" + str + "', cmdid=" + this.field_cmdid + ", functionmsgid='" + this.field_functionmsgid + "', version=" + this.field_version + ", preVersion=" + this.field_preVersion + ", status=" + this.field_status + ", actionTime=" + this.field_actionTime + ", delayTime=" + this.field_delayTime + ", retryCount=" + this.field_retryCount + ", retryCountLimit=" + this.field_retryCountLimit + '}';
            }
        }
        str = "@null";
        return "FunctionMsgItem{cgi='" + str + "', cmdid=" + this.field_cmdid + ", functionmsgid='" + this.field_functionmsgid + "', version=" + this.field_version + ", preVersion=" + this.field_preVersion + ", status=" + this.field_status + ", actionTime=" + this.field_actionTime + ", delayTime=" + this.field_delayTime + ", retryCount=" + this.field_retryCount + ", retryCountLimit=" + this.field_retryCountLimit + '}';
    }
}
