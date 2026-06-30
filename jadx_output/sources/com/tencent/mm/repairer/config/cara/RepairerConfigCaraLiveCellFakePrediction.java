package com.tencent.mm.repairer.config.cara;

/* loaded from: classes12.dex */
public class RepairerConfigCaraLiveCellFakePrediction extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Cara_Live_Cell_Fake_Prediction_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "预测结果";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupCaraLiveCell.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 1;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_plugin_cara_live_cell_fake_prediction";
    }

    @Override // q55.d
    public java.util.List n() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        return arrayList;
    }

    @Override // q55.d
    public java.util.List o() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("正常运行");
        arrayList.add("随机");
        arrayList.add("始终 positive");
        arrayList.add("始终 negative");
        arrayList.add("始终不预测");
        return arrayList;
    }
}
