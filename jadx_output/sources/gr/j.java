package gr;

/* loaded from: classes15.dex */
public final class j extends gr.b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274665b;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f274667d;

    /* renamed from: c, reason: collision with root package name */
    public final f21.e f274666c = new f21.e();

    /* renamed from: e, reason: collision with root package name */
    public final f21.h0 f274668e = new f21.h0();

    public j(boolean z17) {
        this.f274665b = z17;
    }

    @Override // gr.b
    public void a(org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(parser, "parser");
        java.lang.String d17 = d(parser, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        f21.e eVar = this.f274666c;
        eVar.f258872e = d17;
        eVar.f258874g = c(parser, "reportType");
        eVar.f258877m = d(parser, "langs");
        java.lang.String d18 = d(parser, "BeginDate");
        java.lang.String d19 = d(parser, "EndDate");
        java.lang.String d27 = d(parser, "BeginTimeInterval");
        java.lang.String d28 = d(parser, "EndTimeInterval");
        super.a(parser);
        int i17 = 0;
        eVar.f258875h = com.tencent.mm.sdk.platformtools.t8.a0(d18, 0);
        eVar.f258876i = com.tencent.mm.sdk.platformtools.t8.a0(d19, 0);
        if (eVar.f258875h == 0 && eVar.f258876i == 0) {
            return;
        }
        int i18 = 86400;
        if (eVar.f258878n >= 3) {
            int D1 = !com.tencent.mm.sdk.platformtools.t8.K0(d27) ? com.tencent.mm.sdk.platformtools.t8.D1(d27, 0) : 0;
            int D12 = !com.tencent.mm.sdk.platformtools.t8.K0(d28) ? com.tencent.mm.sdk.platformtools.t8.D1(d28, 0) : 86400;
            int max = java.lang.Math.max(0, java.lang.Math.min(D1, 86400));
            i18 = java.lang.Math.max(0, java.lang.Math.min(D12, 86400));
            i17 = max;
        }
        eVar.f258875h += i17;
        eVar.f258876i += i18;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001e. Please report as an issue. */
    @Override // gr.b
    public void b(java.lang.String tag, org.xmlpull.v1.XmlPullParser parser) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(parser, "parser");
        int hashCode = tag.hashCode();
        f21.h0 h0Var = this.f274668e;
        f21.e eVar = this.f274666c;
        switch (hashCode) {
            case -2105342875:
                if (tag.equals("MagicEmojiEffectId")) {
                    eVar.f258885u = f(parser);
                    return;
                }
                g(parser);
                return;
            case -1565818326:
                if (tag.equals("MiniApp")) {
                    gr.l lVar = new gr.l();
                    lVar.a(parser);
                    eVar.f258886v = lVar.f274670b;
                    return;
                }
                g(parser);
                return;
            case -1289878496:
                if (tag.equals("LuckyBag")) {
                    gr.b0 b0Var = new gr.b0();
                    b0Var.a(parser);
                    f21.d0 d0Var = b0Var.f274662b;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f258852d)) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1263, 0);
                    } else {
                        r4 = true;
                    }
                    if (r4) {
                        eVar.f258879o = d0Var;
                        return;
                    }
                    return;
                }
                g(parser);
                return;
            case -730941173:
                if (tag.equals("AnimType")) {
                    h0Var.f258908f = c(parser, "viewcount");
                    h0Var.f258909g = c(parser, "minSize");
                    h0Var.f258910h = c(parser, "maxSize");
                    h0Var.f258907e = e(parser);
                    return;
                }
                g(parser);
                return;
            case -671077817:
                if (tag.equals("FileName")) {
                    eVar.f258880p.add(h0Var);
                    h0Var.f258906d = f(parser);
                    return;
                }
                g(parser);
                return;
            case -585668469:
                if (tag.equals("EffectType")) {
                    eVar.f258884t = e(parser);
                    return;
                }
                g(parser);
                return;
            case -177232682:
                if (tag.equals("RedEnvelopeCover")) {
                    gr.m mVar = new gr.m();
                    mVar.a(parser);
                    eVar.f258883s = mVar.f274671b;
                    return;
                }
                g(parser);
                return;
            case 2211858:
                if (tag.equals("Game")) {
                    gr.i iVar = new gr.i();
                    iVar.a(parser);
                    eVar.f258882r = iVar.f274664b;
                    return;
                }
                g(parser);
                return;
            case 2622298:
                if (tag.equals("Type")) {
                    eVar.f258881q = e(parser);
                    return;
                }
                g(parser);
                return;
            case 524213478:
                if (tag.equals("TopAnim")) {
                    f21.l lVar2 = new f21.l();
                    lVar2.f258931d = c(parser, "width");
                    lVar2.f258932e = c(parser, "height");
                    java.lang.String d17 = d(parser, "blockDuration");
                    lVar2.f258933f = d17.length() == 0 ? 0.0d : com.tencent.mm.sdk.platformtools.t8.A1(d17);
                    lVar2.f258934g = f(parser);
                    eVar.f258887w = lVar2;
                    return;
                }
                g(parser);
                return;
            case 849291753:
                if (tag.equals("KeyWord")) {
                    f21.f fVar = new f21.f();
                    fVar.f258892e = d(parser, "lang");
                    java.lang.String f17 = f(parser);
                    fVar.f258891d = f17;
                    if (f17.length() > 0) {
                        eVar.f258871d.add(fVar);
                        return;
                    }
                    return;
                }
                g(parser);
                return;
            case 947396446:
                if (tag.equals("ClientEggVersion")) {
                    if (this.f274665b) {
                        eVar.f258878n = e(parser);
                        return;
                    } else {
                        g(parser);
                        return;
                    }
                }
                g(parser);
                return;
            case 1552259586:
                if (tag.equals("SupportedCliVers")) {
                    gr.n nVar = new gr.n();
                    nVar.a(parser);
                    this.f274667d = nVar.f274672b;
                    return;
                }
                g(parser);
                return;
            case 2129029771:
                if (tag.equals("NewAnimType")) {
                    f21.h0 h0Var2 = new f21.h0();
                    h0Var2.f258908f = c(parser, "viewcount");
                    h0Var2.f258909g = c(parser, "minSize");
                    h0Var2.f258910h = c(parser, "maxSize");
                    h0Var2.f258906d = d(parser, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
                    h0Var2.f258907e = e(parser);
                    eVar.f258880p.add(h0Var2);
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
