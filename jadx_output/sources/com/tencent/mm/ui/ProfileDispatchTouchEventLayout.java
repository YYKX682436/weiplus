package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\f\u001a\u00060\bR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/ProfileDispatchTouchEventLayout;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "i", "Ljz5/g;", "getPullDownListView", "()Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "pullDownListView", "Lcom/tencent/mm/ui/tg;", "m", "getGestureListener", "()Lcom/tencent/mm/ui/tg;", "gestureListener", "Landroid/view/GestureDetector;", "n", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "Lcom/tencent/mm/plugin/textstatus/ui/LongTextView;", "getCurStatusLongTextView", "()Lcom/tencent/mm/plugin/textstatus/ui/LongTextView;", "curStatusLongTextView", "Landroid/view/View;", "getBackPreviewContent", "()Landroid/view/View;", "backPreviewContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ProfileDispatchTouchEventLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f197047d;

    /* renamed from: e, reason: collision with root package name */
    public final float f197048e;

    /* renamed from: f, reason: collision with root package name */
    public final float f197049f;

    /* renamed from: g, reason: collision with root package name */
    public float f197050g;

    /* renamed from: h, reason: collision with root package name */
    public float f197051h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g pullDownListView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gestureListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gestureDetector;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileDispatchTouchEventLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.plugin.textstatus.ui.LongTextView getCurStatusLongTextView() {
        com.tencent.mm.plugin.textstatus.ui.n2 U6;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(uj4.e.class);
        if (eVar == null || (U6 = eVar.U6()) == null) {
            return null;
        }
        return U6.f174198o;
    }

    private final android.view.GestureDetector getGestureDetector() {
        return (android.view.GestureDetector) ((jz5.n) this.gestureDetector).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.tg getGestureListener() {
        return (com.tencent.mm.ui.tg) ((jz5.n) this.gestureListener).getValue();
    }

    private final com.tencent.mm.ui.widget.listview.PullDownListView getPullDownListView() {
        return (com.tencent.mm.ui.widget.listview.PullDownListView) ((jz5.n) this.pullDownListView).getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).f428423m;
        android.view.GestureDetector gestureDetector = getGestureDetector();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/ProfileDispatchTouchEventLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/ProfileDispatchTouchEventLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (z17) {
            if (getGestureListener().f209901d) {
                com.tencent.mm.plugin.textstatus.ui.LongTextView curStatusLongTextView = getCurStatusLongTextView();
                if (curStatusLongTextView != null ? kotlin.jvm.internal.o.b(curStatusLongTextView.c(), java.lang.Boolean.TRUE) : false) {
                    com.tencent.mm.plugin.textstatus.ui.LongTextView curStatusLongTextView2 = getCurStatusLongTextView();
                    if (curStatusLongTextView2 != null ? curStatusLongTextView2.dispatchTouchEvent(event) : false) {
                        event.getAction();
                        return true;
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(event);
                event.getAction();
                if (dispatchTouchEvent) {
                    return dispatchTouchEvent;
                }
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = getPullDownListView();
                boolean dispatchTouchEvent2 = pullDownListView != null ? pullDownListView.dispatchTouchEvent(event) : false;
                event.getAction();
                return dispatchTouchEvent2;
            }
            android.view.View backPreviewContent = getBackPreviewContent();
            if (backPreviewContent != null) {
                boolean dispatchTouchEvent3 = backPreviewContent.dispatchTouchEvent(event);
                event.getAction();
                if (dispatchTouchEvent3) {
                    return true;
                }
            }
        }
        boolean dispatchTouchEvent4 = super.dispatchTouchEvent(event);
        event.getAction();
        return dispatchTouchEvent4;
    }

    public final android.view.View getBackPreviewContent() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.ref.WeakReference weakReference = ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).f428420g;
        if (weakReference != null) {
            return (android.view.ViewGroup) weakReference.get();
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        return super.onInterceptTouchEvent(ev6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDispatchTouchEventLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f197047d = "MicroMsg.ProfileDispatchTouchEventLayout";
        this.f197048e = 50.0f;
        this.f197049f = 50.0f;
        this.pullDownListView = jz5.h.b(new com.tencent.mm.ui.wg(context));
        this.gestureListener = jz5.h.b(new com.tencent.mm.ui.vg(this));
        this.gestureDetector = jz5.h.b(new com.tencent.mm.ui.ug(context, this));
    }
}
