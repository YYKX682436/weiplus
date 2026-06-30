package f93;

/* loaded from: classes11.dex */
public final class u4 implements com.tencent.mm.ui.contact.item.b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f260479a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f260480b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f260481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f260482d;

    public u4(f93.b5 b5Var) {
        this.f260482d = b5Var;
    }

    public final com.tencent.mm.ui.widget.MMEditText a() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f260479a;
        if (mMEditText != null) {
            return mMEditText;
        }
        kotlin.jvm.internal.o.o("editText");
        throw null;
    }

    public final android.widget.TextView b() {
        android.widget.TextView textView = this.f260481c;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("mErrorMsgTextView");
        throw null;
    }
}
