package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public enum r {
    MMNEWTIPS_SHOWTYPE_NONE("无红点", 10000),
    MMNEWTIPS_SHOWTYPE_REDPOINT("普通红点", 0),
    MMNEWTIPS_SHOWTYPE_NEW("New 红点", 1),
    MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE("带 TITLE 红点", 2),
    MMNEWTIPS_SHOWTYPE_REDPOINT_ICON("带 ICON 红点", 3),
    MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON("同时带 TITLE 和 ICON 红点", 4),
    MMNEWTIPS_SHOWTYPE_COUNTER("计数红点", 5);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152395d;

    /* renamed from: e, reason: collision with root package name */
    public final int f152396e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f152397f = null;

    r(java.lang.String str, int i17) {
        this.f152395d = str;
        this.f152396e = i17;
    }

    public static com.tencent.mm.plugin.newtips.model.r a(int i17) {
        com.tencent.mm.plugin.newtips.model.r rVar = MMNEWTIPS_SHOWTYPE_REDPOINT;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 10000 ? rVar : MMNEWTIPS_SHOWTYPE_NONE : MMNEWTIPS_SHOWTYPE_COUNTER : MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON : MMNEWTIPS_SHOWTYPE_REDPOINT_ICON : MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE : MMNEWTIPS_SHOWTYPE_NEW : rVar;
    }

    public static r45.pm6 b(com.tencent.mm.plugin.newtips.model.r rVar, dm.j8 j8Var) {
        r45.pm6 pm6Var = new r45.pm6();
        int ordinal = rVar.ordinal();
        if (ordinal == 3) {
            pm6Var.f383187e = j8Var.field_title;
        } else if (ordinal == 4) {
            pm6Var.f383188f = j8Var.field_icon_url;
        } else if (ordinal == 5) {
            pm6Var.f383188f = j8Var.field_icon_url;
            pm6Var.f383187e = j8Var.field_title;
        }
        pm6Var.f383199t = j8Var.field_extInfo;
        pm6Var.f383202w = j8Var.field_showType;
        pm6Var.f383200u = j8Var.field_tipId;
        pm6Var.f383201v = j8Var.field_uniqueId;
        return pm6Var;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "NewTipsShowType{commet='" + this.f152395d + "', value=" + this.f152396e + '}';
    }
}
