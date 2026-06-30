package qd1;

/* loaded from: classes7.dex */
public class t implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f361677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.w f361678e;

    public t(qd1.w wVar, android.widget.TextView textView) {
        this.f361678e = wVar;
        this.f361677d = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f361677d;
        if (textView.getLineCount() > 1) {
            textView.setTextSize(0, i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479628b3));
            int h17 = i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479861ha);
            qd1.w wVar = this.f361678e;
            wVar.getClass();
            textView.setSpannableFactory(new qd1.v(wVar, h17));
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
