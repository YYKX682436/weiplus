package td4;

/* loaded from: classes4.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td4.g0 f417729d;

    public t(td4.g0 g0Var) {
        this.f417729d = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        td4.f2 f2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 g0Var = this.f417729d;
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.n6f);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (intValue >= g0Var.getItemCount()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                f2Var = null;
            } else {
                td4.f2 f2Var2 = (td4.f2) g0Var.N().get(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                f2Var = f2Var2;
            }
            if (f2Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                int indexOf = g0Var.Q().indexOf(f2Var);
                boolean z17 = true;
                if (indexOf == -1) {
                    if (g0Var.Q().size() < g0Var.f417668g) {
                        g0Var.Q().add(f2Var);
                        g0Var.Q().size();
                        z17 = false;
                    }
                    g0Var.notifyItemChanged(intValue);
                } else if (indexOf != -1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    if (indexOf < 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int size = g0Var.Q().size();
                        while (indexOf < size) {
                            int O = g0Var.O((td4.f2) g0Var.Q().get(indexOf));
                            if (O != -1) {
                                arrayList2.add(java.lang.Integer.valueOf(O));
                            }
                            indexOf++;
                        }
                        if (g0Var.Q().remove(f2Var) && !g0Var.Q().contains(f2Var)) {
                            java.util.Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                g0Var.notifyItemChanged(((java.lang.Number) it.next()).intValue());
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    }
                    z17 = false;
                }
                if (z17) {
                    yz5.a aVar = g0Var.f417679u;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    td4.j jVar = g0Var.f417675q;
                    if (jVar != null) {
                        int size2 = g0Var.Q().size();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectItemChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$3");
                        int i17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        ((td4.j1) jVar).f417695a.l7(size2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectItemChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$3");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2");
    }
}
