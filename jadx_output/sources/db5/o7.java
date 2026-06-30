package db5;

/* loaded from: classes.dex */
public class o7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228460e;

    public o7(android.widget.TextView textView, android.content.Context context) {
        this.f228459d = textView;
        this.f228460e = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f228459d;
        if (textView.getLineCount() > 1) {
            textView.setTextSize(0, i65.a.h(this.f228460e, com.tencent.mm.R.dimen.f479628b3));
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
