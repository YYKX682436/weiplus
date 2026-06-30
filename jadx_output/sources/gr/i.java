package gr;

/* loaded from: classes15.dex */
public final class i extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final f21.d f274664b = new f21.d();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        f21.d dVar = this.f274664b;
        switch (hashCode) {
            case -1578523488:
                if (tag.equals("AndroidURL")) {
                    dVar.f258849f = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1213391326:
                if (tag.equals("iOSURL")) {
                    dVar.f258848e = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1140436484:
                if (tag.equals("LiteAppUrl")) {
                    dVar.f258851h = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1061003427:
                if (tag.equals("EntryAnimType")) {
                    f21.h0 h0Var = new f21.h0();
                    h0Var.f258908f = 1;
                    int c17 = c(parser, "size");
                    h0Var.f258909g = c17;
                    h0Var.f258910h = c17;
                    h0Var.f258906d = d(parser, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
                    h0Var.f258907e = e(parser);
                    dVar.f258850g = h0Var;
                    return;
                }
                g(parser);
                return;
            case 63475452:
                if (tag.equals("AppId")) {
                    dVar.f258847d = f(parser);
                    return;
                }
                g(parser);
                return;
            default:
                g(parser);
                return;
        }
    }
}
