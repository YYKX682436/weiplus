package kp4;

/* loaded from: classes10.dex */
public final class f extends kp4.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f311102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f311103e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView f311104f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar f311105g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kp4.h f311106h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kp4.h hVar, android.view.View itemView, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f311106h = hVar;
        this.f311102d = i17;
        this.f311103e = i65.a.b(itemView.getContext(), 8);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gdt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f311104f = (com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f487388oi1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f311105g = (com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar) findViewById2;
    }

    @Override // kp4.c
    public void i(kp4.c1 trackInfo) {
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = this.f311104f;
        editFrameListView.f175988n = true;
        editFrameListView.f175989o = true;
        editFrameListView.f175990p = false;
        editFrameListView.f175991q = false;
        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar = this.f311105g;
        editSliderSeekBar.setMaskColor(1999383596);
        editSliderSeekBar.setEnableHapticAtEdge(true);
        editFrameListView.a(trackInfo, this.f311102d, true, true);
        editSliderSeekBar.setOnSliderTouchListener(new kp4.e(trackInfo, this, true, true, this.f311106h));
        if (trackInfo.f311079i == this.f311106h.f311111f) {
            int showWidth = editFrameListView.getShowWidth();
            int i17 = this.f311103e;
            editSliderSeekBar.d(showWidth - (i17 * 2), editFrameListView.getMinWidth(), i17);
        } else {
            editSliderSeekBar.f148837e = false;
            editSliderSeekBar.f148838f = 0;
            editSliderSeekBar.f148839g = 0;
            editSliderSeekBar.f148842m.setBounds(0, 0, 0, 0);
            editSliderSeekBar.f148843n.setBounds(0, 0, 0, 0);
            editSliderSeekBar.invalidate();
        }
        android.view.View view = this.itemView;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = editFrameListView.getValidWidth();
        view.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = editSliderSeekBar.getLayoutParams();
        layoutParams2.width = editFrameListView.getValidWidth();
        editSliderSeekBar.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = editFrameListView.getLayoutParams();
        layoutParams3.width = editFrameListView.getValidWidth();
        editFrameListView.setLayoutParams(layoutParams3);
    }

    @Override // kp4.c
    public void j() {
        com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = this.f311104f;
        rm5.k kVar = editFrameListView.f175996v;
        if (kVar != null) {
            kVar.destroy();
        }
        editFrameListView.f175996v = null;
    }

    @Override // kp4.c
    public void k(kp4.c1 trackInfo, boolean z17) {
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        int i17 = trackInfo.f311079i;
        int i18 = this.f311106h.f311111f;
        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar = this.f311105g;
        if (i17 == i18) {
            int b17 = i65.a.b(this.itemView.getContext(), 8);
            com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = this.f311104f;
            if (editFrameListView.getShowWidth() > 0) {
                editSliderSeekBar.d(editFrameListView.getShowWidth() - (b17 * 2), editFrameListView.getMinWidth(), b17);
                return;
            }
            return;
        }
        editSliderSeekBar.f148837e = false;
        editSliderSeekBar.f148838f = 0;
        editSliderSeekBar.f148839g = 0;
        editSliderSeekBar.f148842m.setBounds(0, 0, 0, 0);
        editSliderSeekBar.f148843n.setBounds(0, 0, 0, 0);
        editSliderSeekBar.invalidate();
    }
}
