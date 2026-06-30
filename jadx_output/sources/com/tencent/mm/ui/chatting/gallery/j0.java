package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public final class j0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment f201040d;

    public j0(com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment) {
        this.f201040d = emojiHistoryListFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        androidx.fragment.app.FragmentActivity activity = this.f201040d.getActivity();
        kotlin.jvm.internal.o.d(activity);
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((ee5.e3) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(ee5.e3.class)).O6();
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
