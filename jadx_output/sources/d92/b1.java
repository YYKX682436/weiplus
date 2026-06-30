package d92;

/* loaded from: classes.dex */
public final class b1 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.goq);
        root.view(com.tencent.mm.R.id.gor).desc(com.tencent.mm.R.string.d6h);
        root.view(com.tencent.mm.R.id.eyt).desc(com.tencent.mm.R.string.eca).disableChildren();
        com.tencent.mm.accessibility.base.ViewSetter view = root.view(com.tencent.mm.R.id.khs);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        view.type(viewType);
        root.view(com.tencent.mm.R.id.egs).desc(new d92.a1(context));
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.f485135go4);
        root2.view(com.tencent.mm.R.id.go6).desc(com.tencent.mm.R.string.d6h);
        root2.view(com.tencent.mm.R.id.f485132go1).desc(com.tencent.mm.R.string.dgp);
        root2.view(com.tencent.mm.R.id.goh).desc(com.tencent.mm.R.string.dgo);
        root2.view(com.tencent.mm.R.id.icr).desc(com.tencent.mm.R.string.dgm).type(com.tencent.mm.accessibility.type.ViewType.TextView);
        root2.view(com.tencent.mm.R.id.f486358l02).type(viewType);
        root2.view(com.tencent.mm.R.id.f485134go3).disable();
        focusFirst(com.tencent.mm.R.id.go6);
        focusOrder().next(com.tencent.mm.R.id.go6).next(com.tencent.mm.R.id.f485136go5).next(com.tencent.mm.R.id.f485132go1);
    }
}
