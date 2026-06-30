package gc3;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270426d;

    public f(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout) {
        this.f270426d = luckyMoneyVoiceLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = this.f270426d;
        int i17 = luckyMoneyVoiceLayout.f147611n;
        luckyMoneyVoiceLayout.getClass();
        com.tencent.mm.plugin.luckymoney.ui.jp jpVar = luckyMoneyVoiceLayout.f147605e;
        jpVar.f147088m = 7;
        jpVar.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
