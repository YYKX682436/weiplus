package yw3;

/* loaded from: classes11.dex */
public final class c7 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        yw3.b7 b7Var = new yw3.b7();
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            stringExtra = "RepairerSvgDemoUI";
        }
        b7Var.f466703e = stringExtra;
        return b7Var;
    }
}
