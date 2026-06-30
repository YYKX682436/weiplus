package wa4;

/* loaded from: classes4.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444231d;

    /* renamed from: e, reason: collision with root package name */
    public int f444232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f444233f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f444234g;

    /* renamed from: h, reason: collision with root package name */
    public int f444235h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f444236i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f444237m;

    /* renamed from: n, reason: collision with root package name */
    public int f444238n;

    /* renamed from: o, reason: collision with root package name */
    public int f444239o;

    /* renamed from: p, reason: collision with root package name */
    public int f444240p;

    /* renamed from: q, reason: collision with root package name */
    public int f444241q;

    /* renamed from: r, reason: collision with root package name */
    public int f444242r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
        if (fVar == null || !(fVar instanceof wa4.h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        wa4.h hVar = (wa4.h) fVar;
        if (!n51.f.a(this.f444231d, hVar.f444231d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444232e), java.lang.Integer.valueOf(hVar.f444232e))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(this.f444233f, hVar.f444233f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(this.f444234g, hVar.f444234g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444235h), java.lang.Integer.valueOf(hVar.f444235h))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(this.f444236i, hVar.f444236i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(this.f444237m, hVar.f444237m)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444238n), java.lang.Integer.valueOf(hVar.f444238n))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444239o), java.lang.Integer.valueOf(hVar.f444239o))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444240p), java.lang.Integer.valueOf(hVar.f444240p))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444241q), java.lang.Integer.valueOf(hVar.f444241q))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return false;
        }
        if (n51.f.a(java.lang.Integer.valueOf(this.f444242r), java.lang.Integer.valueOf(hVar.f444242r))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Media");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f444231d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f444232e);
            java.lang.String str2 = this.f444233f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f444234g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f444235h);
            java.lang.String str4 = this.f444236i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f444237m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f444238n);
            fVar.e(9, this.f444239o);
            fVar.e(10, this.f444240p);
            fVar.e(11, this.f444241q);
            fVar.e(12, this.f444242r);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f444231d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.e(2, this.f444232e);
            java.lang.String str7 = this.f444233f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f444234g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int e17 = j17 + b36.f.e(5, this.f444235h);
            java.lang.String str9 = this.f444236i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f444237m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f444238n) + b36.f.e(9, this.f444239o) + b36.f.e(10, this.f444240p) + b36.f.e(11, this.f444241q) + b36.f.e(12, this.f444242r);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.h hVar = (wa4.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f444231d = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 2:
                hVar.f444232e = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 3:
                hVar.f444233f = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 4:
                hVar.f444234g = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 5:
                hVar.f444235h = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 6:
                hVar.f444236i = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 7:
                hVar.f444237m = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 8:
                hVar.f444238n = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 9:
                hVar.f444239o = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 10:
                hVar.f444240p = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 11:
                hVar.f444241q = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            case 12:
                hVar.f444242r = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return 0;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Media");
                return -1;
        }
    }
}
