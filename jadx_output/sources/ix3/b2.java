package ix3;

/* loaded from: classes10.dex */
public final class b2 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        ix3.a2 a2Var = new ix3.a2();
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            stringExtra = "";
        }
        a2Var.f295360e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("dirPath");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        a2Var.f295361f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
        a2Var.f295362g = stringExtra3 != null ? stringExtra3 : "";
        return a2Var;
    }
}
