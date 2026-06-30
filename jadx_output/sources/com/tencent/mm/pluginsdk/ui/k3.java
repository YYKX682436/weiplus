package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputFooter f190885d;

    public k3(com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter) {
        this.f190885d = voiceInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.pluginsdk.ui.VoiceInputFooter.f189840x;
        final com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = this.f190885d;
        if (voiceInputFooter.f189843p.getVisibility() == 0) {
            voiceInputFooter.j();
        }
        boolean z17 = voiceInputFooter.f189849v;
        com.tencent.mm.ui.MMActivity mMActivity = voiceInputFooter.f189841n;
        if (z17) {
            voiceInputFooter.f189844q.requestFocus();
            voiceInputFooter.i();
            mMActivity.showVKB();
            voiceInputFooter.f189845r.setImageResource(com.tencent.mm.R.drawable.f481235o1);
        } else {
            mMActivity.hideVKB();
            voiceInputFooter.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.VoiceInputFooter$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter2 = com.tencent.mm.pluginsdk.ui.VoiceInputFooter.this;
                    voiceInputFooter2.f189849v = true;
                    voiceInputFooter2.f189842o.i();
                    voiceInputFooter2.f189842o.setVisibility(0);
                }
            }, 100L);
            voiceInputFooter.f189844q.requestFocus();
            voiceInputFooter.f189845r.setImageResource(com.tencent.mm.R.drawable.f481236o2);
            voiceInputFooter.f189846s.setImageResource(com.tencent.mm.R.drawable.b9u);
        }
        voiceInputFooter.k(1);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
