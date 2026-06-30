package yt3;

/* loaded from: classes10.dex */
public final class d0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f465397d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f465398e;

    /* renamed from: f, reason: collision with root package name */
    public ct0.b f465399f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f465400g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f465401h;

    public d0(android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465397d = parent;
        this.f465401h = (android.view.ViewGroup) parent.findViewById(com.tencent.mm.R.id.pqw);
    }

    public final int a() {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f465400g;
        int i17 = 0;
        int i18 = (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null) ? 0 : bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0);
        int i19 = i18 >> 4;
        if (i19 == 2) {
            i17 = 1;
        } else if (i19 == 3) {
            i17 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).nj(nu3.i.f340218a.l());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditJumpThirdPlugin", "[getVideoSource] tecScene:" + i18 + " tecSceneShr:" + i19 + " videoSource:" + i17);
        return i17;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.ViewGroup viewGroup = this.f465401h;
        if (i17 != 0) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
        } else {
            if (!this.f465398e || viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }
}
