package hk5;

/* loaded from: classes9.dex */
public final class m extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        g00.c cVar;
        w05.b bVar;
        fc5.a model = (fc5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        b00.r rVar = (b00.r) ((c00.z2) c17);
        kotlin.jvm.internal.o.g(context, "context");
        rVar.f16757d.getClass();
        com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle ecsProductCardViewNewStyle = new com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle(context, null, 0, 6, null);
        java.lang.String j17 = model.j();
        if (j17 == null) {
            j17 = "";
        }
        java.lang.String talker = model.getString(model.f43702d + 1);
        kotlin.jvm.internal.o.g(talker, "talker");
        rVar.f16757d.getClass();
        l15.c cVar2 = new l15.c();
        cVar2.fromXml(j17);
        v05.b k17 = cVar2.k();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SHARE;
        if (k17 == null || (bVar = (w05.b) k17.getCustom(k17.f432315e + 54)) == null) {
            cVar = new g00.c(null, x8Var);
        } else {
            cVar = new g00.c(e00.l.c(bVar), x8Var);
            cVar.f267388f = talker;
        }
        ecsProductCardViewNewStyle.setViewModel(cVar);
        return ecsProductCardViewNewStyle;
    }

    @Override // o50.j
    public void X6(android.view.View previewChattingView) {
        kotlin.jvm.internal.o.g(previewChattingView, "previewChattingView");
        previewChattingView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
    }
}
