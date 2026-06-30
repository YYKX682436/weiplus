package x90;

@j95.b
/* loaded from: classes5.dex */
public final class m extends i95.w implements ct.f3 {

    /* renamed from: d, reason: collision with root package name */
    public a31.m f452619d;

    public void wi(android.content.Context context, int i17, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout, java.lang.String userName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (this.f452619d == null) {
            this.f452619d = new a31.m();
        }
        a31.m mVar = this.f452619d;
        if (mVar != null) {
            mVar.f(context, i17, mMEditText, speechInputLayout, userName);
        }
    }
}
