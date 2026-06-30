package n14;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.layout.clg, com.tencent.mm.R.id.gbg).type(com.tencent.mm.accessibility.type.ViewType.SeekBar).desc(new n14.b(getString(com.tencent.mm.R.string.ink))).onSeekBackward(n14.c.f334144d).onSeekForward(n14.d.f334145d);
    }
}
