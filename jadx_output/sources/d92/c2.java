package d92;

/* loaded from: classes.dex */
public final class c2 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        focusFirst(android.R.id.content);
        focusOrder().next(com.tencent.mm.R.id.p4d).next(com.tencent.mm.R.id.p4e).next(com.tencent.mm.R.id.p4k);
        focusOrder().next(com.tencent.mm.R.id.nm8).next(com.tencent.mm.R.id.nm9);
    }
}
