package hk5;

/* loaded from: classes9.dex */
public final class n extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.b();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        com.tencent.mm.mvvm.MvvmView ecsShopWindowViewNew;
        g00.f fVar;
        java.lang.String R;
        fc5.b model = (fc5.b) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c00.z2 z2Var = (c00.z2) c17;
        l15.c cVar = new l15.c();
        java.lang.String j17 = model.j();
        java.lang.String str = "";
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        w05.a aVar2 = k17 != null ? (w05.a) k17.getCustom(k17.f432315e + 56) : null;
        if (aVar2 != null && (R = aVar2.R()) != null) {
            str = R;
        }
        if (com.tencent.mm.storage.m2.a(str) > 0) {
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            ((b00.r) z2Var).f16757d.getClass();
            ecsShopWindowViewNew = new com.tencent.mm.feature.ecs.card.view.EcsShopCardView(context, null, 0);
        } else {
            androidx.appcompat.app.AppCompatActivity context2 = getActivity();
            kotlin.jvm.internal.o.g(context2, "context");
            ((b00.r) z2Var).f16757d.getClass();
            ecsShopWindowViewNew = new com.tencent.mm.feature.ecs.card.view.EcsShopWindowViewNew(context2, null, 0);
        }
        java.lang.String talker = model.getString(model.f43702d + 1);
        kotlin.jvm.internal.o.g(talker, "talker");
        ((b00.r) z2Var).f16757d.getClass();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SHARE;
        if (aVar2 == null) {
            fVar = new g00.f(null, x8Var);
        } else {
            g00.f fVar2 = new g00.f(e00.l.f(aVar2), x8Var);
            fVar2.f267400f = talker;
            fVar = fVar2;
        }
        ecsShopWindowViewNew.setViewModel(fVar);
        return ecsShopWindowViewNew;
    }
}
