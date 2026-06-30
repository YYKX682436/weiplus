package p05;

/* loaded from: classes14.dex */
public final class h1 extends p05.g1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f350532g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f350533h;

    /* renamed from: i, reason: collision with root package name */
    public double f350534i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f350535j = new java.util.LinkedHashMap();

    @Override // p05.g1
    public void c(java.lang.String str, java.lang.String str2) {
        ((java.util.LinkedHashMap) this.f350535j).clear();
        this.f350532g = str;
        this.f350533h = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", "#change makeupRes=" + str + " filterRes=" + str2);
        if (!this.f350524a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        if (this.f350524a) {
            this.f350527d = 0;
            java.util.ArrayList arrayList = this.f350528e;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jz5.l lVar = (jz5.l) it.next();
                com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350526c, ((java.lang.Number) lVar.f302833d).longValue());
                com.tencent.mm.xeffect.WeEffectRender.a(this.f350526c, ((java.lang.Number) lVar.f302833d).longValue(), null);
            }
            arrayList.clear();
            com.tencent.mm.xeffect.WeEffectRender.nRemoveFilter(this.f350526c, this.f350529f);
            this.f350529f = 0L;
            if (str != null) {
                if (!(str.length() == 0)) {
                    long[] nAddEffectMaterialsFolder = com.tencent.mm.xeffect.WeEffectRender.nAddEffectMaterialsFolder(this.f350526c, str);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#change after nAddEffectMaterialsFolder ptr.size=");
                    sb6.append(nAddEffectMaterialsFolder != null ? java.lang.Integer.valueOf(nAddEffectMaterialsFolder.length) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", sb6.toString());
                    if (nAddEffectMaterialsFolder != null) {
                        if (!(nAddEffectMaterialsFolder.length == 0)) {
                            for (long j17 : nAddEffectMaterialsFolder) {
                                int nGetResourceType = com.tencent.mm.xeffect.WeEffectRender.nGetResourceType(this.f350526c, j17);
                                arrayList.add(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(nGetResourceType)));
                                com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", "#change objId=" + j17 + " objectType=" + nGetResourceType);
                            }
                            p05.z3 z3Var = p05.l4.R;
                            this.f350527d = 47232;
                        }
                    }
                }
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    this.f350529f = com.tencent.mm.xeffect.WeEffectRender.nCreateFilterWithConfig(this.f350526c, str2);
                }
            }
        }
    }

    public void d(int i17, double d17) {
        java.lang.Object obj;
        this.f350535j.put(java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17));
        if (!this.f350524a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        if (this.f350524a) {
            float f17 = (float) d17;
            java.util.Iterator it = this.f350528e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((java.lang.Number) ((jz5.l) obj).f302834e).intValue() == i17) {
                        break;
                    }
                }
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                jz5.l lVar2 = ((java.lang.Number) lVar.f302834e).intValue() >= 0 ? lVar : null;
                if (lVar2 != null) {
                    com.tencent.mm.xeffect.WeEffectRender.nSetMakeUpAlpha(this.f350526c, ((java.lang.Number) lVar2.f302833d).longValue(), f17);
                }
            }
        }
    }
}
