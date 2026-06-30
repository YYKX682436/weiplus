package zv2;

/* loaded from: classes10.dex */
public final class n extends zv2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String wording = jumpInfo.getWording();
        if (wording == null) {
            wording = "";
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(finderJumperView, wording, false, 2, null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().c(new mn2.q3(jumpInfo.getIcon_url(), com.tencent.mm.plugin.finder.storage.y90.f128356f), finderJumperView.getIconDefaultIv(), g1Var.h(mn2.f1.f329964r));
    }

    @Override // zv2.b
    public void f() {
        super.f();
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setVisibility(0);
        finderJumperView.setDefaultTitle("");
        finderJumperView.setDefaultIconId(0);
        finderJumperView.setFilledIconId(0);
    }
}
