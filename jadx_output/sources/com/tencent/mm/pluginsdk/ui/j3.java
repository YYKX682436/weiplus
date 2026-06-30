package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputFooter f190880d;

    public j3(com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter) {
        this.f190880d = voiceInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = this.f190880d;
        voiceInputFooter.f189844q.requestFocus();
        boolean z17 = voiceInputFooter.f189848u;
        com.tencent.mm.ui.MMActivity mMActivity = voiceInputFooter.f189841n;
        if (z17) {
            voiceInputFooter.j();
            mMActivity.showVKB();
        } else {
            voiceInputFooter.f189848u = true;
            mMActivity.hideVKB();
            if (voiceInputFooter.f189842o.getVisibility() == 0) {
                voiceInputFooter.i();
            }
            voiceInputFooter.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.VoiceInputFooter$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.pluginsdk.ui.chat.ib ibVar = com.tencent.mm.pluginsdk.ui.VoiceInputFooter.this.f189843p;
                    if (ibVar != null) {
                        ibVar.setVisibility(0);
                    }
                }
            }, 100L);
            voiceInputFooter.f189846s.setImageResource(com.tencent.mm.R.drawable.f481236o2);
            voiceInputFooter.f189845r.setImageResource(com.tencent.mm.R.drawable.f481235o1);
            voiceInputFooter.f189845r.setVisibility(8);
            com.tencent.mm.pluginsdk.ui.n3 n3Var = voiceInputFooter.f189850w;
            if (n3Var != null) {
                ((com.tencent.mm.pluginsdk.ui.f4) n3Var).f190835a.f189872e.setVisibility(4);
            }
        }
        voiceInputFooter.k(2);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
