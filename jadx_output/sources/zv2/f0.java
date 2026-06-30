package zv2;

/* loaded from: classes10.dex */
public final class f0 extends zv2.b {

    /* renamed from: h, reason: collision with root package name */
    public final int f476403h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView, int i17) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        this.f476403h = i17;
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        java.lang.String concat = "jumpType=".concat(this.f476403h == 34 ? "1" : "2");
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.G).getValue()).r()).booleanValue();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.f(ya2.e1.f460472a, this.f476395d, "wxaliteb74f4307807cc9004781ffe66f3b87c3", "pages/EventPicker", concat, booleanValue, false, false, null, new zv2.b0(this), 224, null);
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo == null || (str = finderJumpInfo.getWording()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(this.f476396e, str, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        int i17 = this.f476403h;
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        if (i17 == 34) {
            finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.finder_mini_game_regular);
            finderJumperView.setFilledIconId(com.tencent.mm.R.raw.finder_mini_game_filled);
        } else {
            finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.finder_playlist_regular);
            finderJumperView.setFilledIconId(com.tencent.mm.R.raw.finder_playlist_filled);
        }
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.c0(this), null, 22, null), new ry2.f(6, 0, 0, new zv2.d0(this), null, 22, null), new ry2.f(2, 0, 0, new zv2.e0(this), null, 22, null)), null);
    }
}
