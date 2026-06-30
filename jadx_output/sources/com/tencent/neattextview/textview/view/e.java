package com.tencent.neattextview.textview.view;

/* loaded from: classes15.dex */
public class e implements android.text.SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f215200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.neattextview.textview.view.NeatTextView f215201e;

    public e(com.tencent.neattextview.textview.view.NeatTextView neatTextView, com.tencent.neattextview.textview.view.b bVar) {
        this.f215201e = neatTextView;
    }

    public final void a(android.text.Spannable spannable) {
        ks5.c cVar;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215201e;
        if (neatTextView.f215178e) {
            neatTextView.postInvalidate();
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f215200d;
        if (weakReference == null || (cVar = (ks5.c) weakReference.get()) == null || cVar.f311805a != spannable) {
            return;
        }
        cVar.u(spannable, cVar.f311808d, cVar.F);
        neatTextView.postInvalidate();
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        a(spannable);
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        a(spannable);
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        a(spannable);
    }
}
