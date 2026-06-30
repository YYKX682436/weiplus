package m21;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f323014a = new java.lang.StringBuffer();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuffer f323015b = new java.lang.StringBuffer();

    /* renamed from: c, reason: collision with root package name */
    public int f323016c = 0;

    public void a(java.lang.String str, java.lang.Object obj) {
        this.f323014a.append(str + "->" + obj + "\n");
        this.f323015b.append(obj);
    }

    public void b(java.lang.String str, java.lang.Object obj) {
        this.f323014a.append(this.f323016c + " " + str + "->" + obj + "\n");
        this.f323015b.append(obj);
        this.f323016c = this.f323016c + 1;
    }

    public java.lang.String c() {
        this.f323016c = 0;
        java.lang.StringBuffer stringBuffer = this.f323014a;
        stringBuffer.append("--end--\n\n");
        return stringBuffer.toString();
    }

    public java.lang.String toString() {
        return this.f323015b.toString();
    }
}
