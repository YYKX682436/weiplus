package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class ha implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ra f190381d;

    public ha(com.tencent.mm.pluginsdk.ui.chat.ra raVar) {
        this.f190381d = raVar;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = this.f190381d;
        if (action == 0) {
            raVar.f190635z.sendEmptyMessage(20002);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        raVar.f190635z.sendEmptyMessageDelayed(20001, 3000L);
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
