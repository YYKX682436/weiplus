package iy2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel f295909d;

    public u(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel) {
        this.f295909d = finderLiveVoiceInputPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.f295909d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveVoiceInputPanel.f136771o;
        if (mMEditText == null || mMEditText.getText() == null) {
            if (finderLiveVoiceInputPanel.f136772p == null || (!r0.isShowing())) {
                finderLiveVoiceInputPanel.f136772p = db5.e1.i(finderLiveVoiceInputPanel.getContext(), com.tencent.mm.R.string.f491497np4, com.tencent.mm.R.string.f490573yv);
            }
        } else {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = finderLiveVoiceInputPanel.f136771o;
            java.lang.String valueOf = java.lang.String.valueOf(mMEditText2 != null ? mMEditText2.getText() : null);
            int length = valueOf.length() - 1;
            int i17 = 0;
            boolean z17 = false;
            while (i17 <= length) {
                boolean z18 = kotlin.jvm.internal.o.i(valueOf.charAt(!z17 ? i17 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z18) {
                    i17++;
                } else {
                    z17 = true;
                }
            }
            if (valueOf.subSequence(i17, length + 1).toString().length() == 0) {
                if (valueOf.length() == 0) {
                    if (finderLiveVoiceInputPanel.f136772p == null || (!r0.isShowing())) {
                        finderLiveVoiceInputPanel.f136772p = db5.e1.i(finderLiveVoiceInputPanel.getContext(), com.tencent.mm.R.string.f491497np4, com.tencent.mm.R.string.f490573yv);
                    }
                }
            }
            if (finderLiveVoiceInputPanel.f136770n != null) {
                com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "sendMsg onSendMsg");
                iy2.r rVar = finderLiveVoiceInputPanel.f136770n;
                if (rVar != null) {
                    ((com.tencent.mm.plugin.finder.live.plugin.wr) rVar).f114991a.f112464z.performClick();
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((ml2.r0) c17).ak(2, 14, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
