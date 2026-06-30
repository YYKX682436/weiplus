package ij2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij2.c f291687d;

    public a(ij2.c cVar) {
        this.f291687d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ij2.c cVar = this.f291687d;
        cVar.b(!cVar.f291691a.isSelected());
        xh2.a aVar = cVar.f291696f;
        if (aVar != null) {
            cVar.f291692b.invoke(java.lang.Integer.valueOf(aVar.f454521b.f454553e), cVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
