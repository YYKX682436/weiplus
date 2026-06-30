package fx3;

/* loaded from: classes10.dex */
public final class s extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        fx3.r rVar = new fx3.r();
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            stringExtra = "RepairerMonitorUI";
        }
        rVar.f267148e = stringExtra;
        return rVar;
    }
}
