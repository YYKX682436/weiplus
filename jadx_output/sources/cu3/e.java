package cu3;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin f222472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin) {
        super(1);
        this.f222472d = photoFilterPlugin;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin = this.f222472d;
        com.tencent.mars.xlog.Log.i(photoFilterPlugin.getTAG(), "onSelect " + intValue);
        if (intValue == 0) {
            photoFilterPlugin.getSeekBarLayout().setVisibility(4);
        } else {
            photoFilterPlugin.getSeekBarLayout().setVisibility(0);
        }
        java.lang.Float valueOf = photoFilterPlugin.getWeightMap().containsKey(java.lang.Integer.valueOf(intValue)) ? photoFilterPlugin.getWeightMap().get(java.lang.Integer.valueOf(intValue)) : java.lang.Float.valueOf(photoFilterPlugin.getDefaultWeight());
        android.widget.SeekBar seekBar = photoFilterPlugin.getSeekBar();
        kotlin.jvm.internal.o.d(valueOf);
        seekBar.setProgress((int) (valueOf.floatValue() * 100));
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin.a(photoFilterPlugin, intValue, valueOf.floatValue());
        for (cu3.d dVar : photoFilterPlugin.getItemViews()) {
            if (dVar.f222467b != intValue) {
                android.view.View view = dVar.f222470e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "unselected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "unselected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
