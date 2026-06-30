package yo4;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464275d;

    public o(yo4.p pVar) {
        this.f464275d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin$updateMusicTipsBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f464275d.L();
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin$updateMusicTipsBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
