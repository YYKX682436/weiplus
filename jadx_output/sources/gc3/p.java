package gc3;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout f270437d;

    public p(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout) {
        this.f270437d = luckyMoneyVoiceTransLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout = this.f270437d;
        luckyMoneyVoiceTransLayout.getCurrentState();
        luckyMoneyVoiceTransLayout.f147619s = true;
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
