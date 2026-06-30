package lg5;

/* loaded from: classes15.dex */
public class c implements android.text.TextWatcher, android.text.SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f318584d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f318585e = new java.util.concurrent.atomic.AtomicInteger(0);

    public c(java.lang.Object obj) {
        this.f318584d = obj;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        ((android.text.TextWatcher) this.f318584d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        ((android.text.TextWatcher) this.f318584d).beforeTextChanged(charSequence, i17, i18, i19);
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        this.f318585e.get();
        obj.getClass();
        ((android.text.SpanWatcher) this.f318584d).onSpanAdded(spannable, obj, i17, i18);
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f318585e;
        if (atomicInteger.get() > 0 && ((obj instanceof al5.w) || (obj instanceof jg5.b))) {
            atomicInteger.get();
            obj.getClass();
        } else {
            atomicInteger.get();
            obj.getClass();
            ((android.text.SpanWatcher) this.f318584d).onSpanChanged(spannable, obj, i17, i18, i19, i27);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f318585e;
        if (atomicInteger.get() > 0 && ((obj instanceof al5.w) || (obj instanceof jg5.b))) {
            atomicInteger.get();
            obj.getClass();
        } else {
            atomicInteger.get();
            obj.getClass();
            ((android.text.SpanWatcher) this.f318584d).onSpanRemoved(spannable, obj, i17, i18);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        ((android.text.TextWatcher) this.f318584d).onTextChanged(charSequence, i17, i18, i19);
    }
}
