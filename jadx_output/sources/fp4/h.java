package fp4;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup f265361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f265362e;

    public h(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup, java.util.LinkedList linkedList, long j17) {
        this.f265361d = timeCropViewGroup;
        this.f265362e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup = this.f265361d;
        androidx.recyclerview.widget.RecyclerView recyclerView = timeCropViewGroup.f175935e;
        if (recyclerView != null) {
            if (recyclerView.getWidth() <= 0) {
                recyclerView.post(timeCropViewGroup.f175950w);
                return;
            }
            timeCropViewGroup.f175945r = i65.a.b(timeCropViewGroup.getContext(), 40);
            timeCropViewGroup.f175944q = ((recyclerView.getWidth() - (timeCropViewGroup.f175945r * 2)) * 1.0f) / ((float) timeCropViewGroup.f175941n);
            float height = ((int) (r4 * ((float) timeCropViewGroup.f175940m))) / (timeCropViewGroup.f175939i * ((recyclerView.getHeight() * 1.0f) / timeCropViewGroup.f175938h));
            java.util.LinkedList<kp4.c1> linkedList = this.f265362e;
            for (kp4.c1 c1Var : linkedList) {
                c1Var.f311076f = ((height / ((float) timeCropViewGroup.f175940m)) * ((float) (c1Var.f311075e - c1Var.f311074d))) / c1Var.f311097n.f175627l.f397506h;
                c1Var.f();
            }
            kp4.c1 c1Var2 = timeCropViewGroup.f175946s;
            int i17 = timeCropViewGroup.f175945r;
            c1Var2.f311073c = i17;
            kp4.c1 c1Var3 = timeCropViewGroup.f175947t;
            c1Var3.f311073c = i17;
            linkedList.add(0, c1Var2);
            linkedList.add(c1Var3);
            kp4.r rVar = timeCropViewGroup.f175936f;
            if (rVar != null) {
                rVar.z(linkedList);
            }
            kp4.r rVar2 = timeCropViewGroup.f175936f;
            if (rVar2 != null) {
                rVar2.notifyDataSetChanged();
            }
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
            if (seekSlider != null) {
                int width = recyclerView.getWidth();
                int i18 = timeCropViewGroup.f175945r;
                seekSlider.post(new fp4.a(seekSlider, width - (i18 * 2), i18, (int) (((float) 1000) * timeCropViewGroup.f175944q)));
            }
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider2 = timeCropViewGroup.getSeekSlider();
            if (seekSlider2 != null) {
                seekSlider2.setCursorPos(0.0f);
            }
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider3 = timeCropViewGroup.getSeekSlider();
            if (seekSlider3 != null) {
                seekSlider3.post(new fp4.g(timeCropViewGroup));
            }
        }
    }
}
