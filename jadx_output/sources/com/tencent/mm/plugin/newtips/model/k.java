package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public class k extends dm.j8 {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f152378y0 = dm.j8.initAutoDBInfo(com.tencent.mm.plugin.newtips.model.k.class);

    public k() {
    }

    @Override // dm.j8, l75.f0
    public l75.e0 getDBInfo() {
        return f152378y0;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.util.LinkedList linkedList;
        r45.sm6 sm6Var = this.field_parents;
        if (sm6Var == null || (linkedList = sm6Var.f385849d) == null || linkedList.size() <= 0) {
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = this.field_parents.f385849d.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(",");
            }
            str = sb6.toString();
        }
        return "NewTipsInfo{field_uniqueId='" + this.field_uniqueId + "', field_path='" + this.field_path + "', field_showType=" + this.field_showType + ", field_title='" + this.field_title + "', field_icon_url='" + this.field_icon_url + "', field_parents=" + str + ", field_tipId=" + this.field_tipId + ", field_priority=" + this.field_priority + ", field_tipType=" + this.field_tipType + ", field_beginShowTime=" + this.field_beginShowTime + ", field_overdueTime=" + this.field_overdueTime + ", field_disappearTime=" + this.field_disappearTime + ", field_minClientVersion=" + this.field_minClientVersion + ", field_maxClientVersion=" + this.field_maxClientVersion + ", field_lang=" + this.field_lang + ", field_reg=" + this.field_regCountry + ", field_state=" + this.field_state + ", field_dynamicPath='" + this.field_dynamicPath + "'}";
    }

    public k(java.lang.String str, int i17, int i18, int i19, long j17, long j18, long j19, int i27, int i28, java.lang.String str2) {
        this.field_uniqueId = str;
        this.field_tipId = i17;
        this.field_priority = i18;
        this.field_tipType = i19;
        this.field_beginShowTime = j17;
        this.field_overdueTime = j18;
        this.field_disappearTime = j19;
        this.field_minClientVersion = i27;
        this.field_maxClientVersion = i28;
        this.field_extInfo = str2;
    }
}
