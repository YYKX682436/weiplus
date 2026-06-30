package gr;

/* loaded from: classes15.dex */
public final class m extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.i f274671b = new f21.i();

    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        boolean b17 = kotlin.jvm.internal.o.b(tag, "AppId");
        f21.i iVar = this.f274671b;
        if (b17) {
            iVar.f258911d = f(parser);
            return;
        }
        if (!kotlin.jvm.internal.o.b(tag, "EntryAnimType")) {
            g(parser);
            return;
        }
        f21.h0 h0Var = new f21.h0();
        h0Var.f258908f = 1;
        int c17 = c(parser, "size");
        h0Var.f258909g = c17;
        h0Var.f258910h = c17;
        h0Var.f258906d = d(parser, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
        h0Var.f258907e = e(parser);
        iVar.f258912e = h0Var;
    }
}
