package iy2;

/* loaded from: classes13.dex */
public final class k implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295898d;

    public k(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl) {
        this.f295898d = finderLiveVoiceInputLayoutImpl;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl = this.f295898d;
        finderLiveVoiceInputLayoutImpl.getTAG();
        finderLiveVoiceInputLayoutImpl.getCurrentState();
        finderLiveVoiceInputLayoutImpl.D = true;
        iy2.b bVar = finderLiveVoiceInputLayoutImpl.C;
        if (bVar != null) {
            bVar.f295880s = 7;
            bVar.f295881t.cancel();
            bVar.invalidateSelf();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
