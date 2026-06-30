package oc1;

/* loaded from: classes.dex */
public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f344139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc1.b f344140e;

    public a(oc1.b bVar, android.widget.TextView textView) {
        this.f344140e = bVar;
        this.f344139d = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f344139d;
        if (textView.getLineCount() > 1) {
            textView.setTextSize(0, i65.a.h(this.f344140e.f344141d, com.tencent.mm.R.dimen.f479628b3));
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
