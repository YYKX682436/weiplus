package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.u0 f173366d;

    public s0(com.tencent.mm.plugin.textstatus.convert.topic.u0 u0Var) {
        this.f173366d = u0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean onTouchEvent = view instanceof androidx.recyclerview.widget.RecyclerView ? this.f173366d.onTouchEvent(motionEvent) : false;
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
