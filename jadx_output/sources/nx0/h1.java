package nx0;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView f341124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.u f341125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView, nx0.u uVar) {
        super(2);
        this.f341124d = beautyView;
        this.f341125e = uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar2;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar3;
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.x beautyItem = (nx0.x) obj2;
        kotlin.jvm.internal.o.g(beautyItem, "beautyItem");
        boolean z17 = beautyItem instanceof nx0.w;
        nx0.u uVar = this.f341125e;
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView = this.f341124d;
        if (z17) {
            beautyView.f69583o = null;
            beautyView.f69584p = -1;
            uVar.z();
            seekBar3 = beautyView.getSeekBar();
            seekBar3.setVisibility(4);
            if (!kotlin.jvm.internal.o.b(beautyView.f69580i, beautyItem)) {
                java.util.List list = uVar.f341232d;
                int i17 = 0;
                for (java.lang.Object obj3 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    nx0.x xVar = (nx0.x) obj3;
                    if ((xVar instanceof nx0.w) && xVar.f341258a) {
                        xVar.f341258a = false;
                        uVar.notifyItemChanged(i17);
                    }
                    i17 = i18;
                }
                nx0.w wVar = (nx0.w) beautyItem;
                beautyView.f69580i = wVar;
                beautyView.f69581m = intValue;
                if (wVar.f341253f) {
                    ((nx0.x) list.get(intValue)).f341258a = true;
                    uVar.notifyItemChanged(intValue);
                } else {
                    java.lang.Object obj4 = list.get(intValue);
                    nx0.w wVar2 = obj4 instanceof nx0.w ? (nx0.w) obj4 : null;
                    if (wVar2 != null) {
                        wVar2.f341258a = true;
                        wVar2.f341252e = true;
                    }
                    uVar.notifyItemChanged(intValue);
                }
                nx0.g1 g1Var = new nx0.g1(beautyItem, uVar, intValue);
                nx0.w wVar3 = beautyView.f69580i;
                if (wVar3 != null) {
                    beautyView.f69586r.invoke(wVar3, new nx0.j1(beautyView, wVar3, g1Var));
                }
            }
        } else if ((beautyItem instanceof nx0.v) && !kotlin.jvm.internal.o.b(beautyView.f69583o, beautyItem)) {
            uVar.z();
            nx0.v vVar = (nx0.v) beautyItem;
            beautyView.f69583o = vVar;
            beautyView.f69584p = intValue;
            ((nx0.x) uVar.f341232d.get(intValue)).f341258a = true;
            uVar.notifyItemChanged(intValue);
            seekBar = beautyView.getSeekBar();
            seekBar.setProgress(a06.d.b(vVar.f341243e * 100));
            seekBar2 = beautyView.getSeekBar();
            seekBar2.setVisibility(0);
        }
        recyclerView = beautyView.getRecyclerView();
        dy0.o.b(recyclerView, intValue, false, 2, null);
        int i19 = uVar.f341234f;
        uVar.f341234f = intValue;
        if (i19 >= 0 && i19 < uVar.f341232d.size()) {
            uVar.notifyItemChanged(i19);
        }
        uVar.notifyItemChanged(uVar.f341234f);
        return jz5.f0.f302826a;
    }
}
