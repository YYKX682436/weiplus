package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pq {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.rq f135581a;

    /* renamed from: b, reason: collision with root package name */
    public long f135582b;

    /* renamed from: c, reason: collision with root package name */
    public int f135583c;

    /* renamed from: d, reason: collision with root package name */
    public int f135584d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f135585e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f135586f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f135587g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f135588h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f135589i;

    /* renamed from: j, reason: collision with root package name */
    public r45.zk2 f135590j;

    /* renamed from: k, reason: collision with root package name */
    public r45.zk2 f135591k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f135592l;

    public pq(com.tencent.mm.plugin.finder.viewmodel.component.rq showState, long j17, int i17, int i18, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.util.Map map, r45.zk2 zk2Var, r45.zk2 zk2Var2, yz5.a aVar, int i19, kotlin.jvm.internal.i iVar) {
        long j18 = (i19 & 2) != 0 ? 0L : j17;
        int i27 = (i19 & 4) != 0 ? 0 : i17;
        int i28 = (i19 & 8) == 0 ? i18 : 0;
        java.util.List shownQuestionIdList = (i19 & 16) != 0 ? new java.util.ArrayList() : list;
        java.util.List selectedAnswerIdList = (i19 & 32) != 0 ? new java.util.ArrayList() : list2;
        java.util.List npsSelectedAnswerIds = (i19 & 64) != 0 ? new java.util.ArrayList() : list3;
        java.lang.String npsInputAnswerTxt = (i19 & 128) != 0 ? "" : str;
        java.util.Map questionShowTimeMap = (i19 & 256) != 0 ? new java.util.LinkedHashMap() : map;
        r45.zk2 zk2Var3 = (i19 & 512) != 0 ? null : zk2Var;
        r45.zk2 zk2Var4 = (i19 & 1024) != 0 ? null : zk2Var2;
        yz5.a aVar2 = (i19 & 2048) == 0 ? aVar : null;
        kotlin.jvm.internal.o.g(showState, "showState");
        kotlin.jvm.internal.o.g(shownQuestionIdList, "shownQuestionIdList");
        kotlin.jvm.internal.o.g(selectedAnswerIdList, "selectedAnswerIdList");
        kotlin.jvm.internal.o.g(npsSelectedAnswerIds, "npsSelectedAnswerIds");
        kotlin.jvm.internal.o.g(npsInputAnswerTxt, "npsInputAnswerTxt");
        kotlin.jvm.internal.o.g(questionShowTimeMap, "questionShowTimeMap");
        this.f135581a = showState;
        this.f135582b = j18;
        this.f135583c = i27;
        this.f135584d = i28;
        this.f135585e = shownQuestionIdList;
        this.f135586f = selectedAnswerIdList;
        this.f135587g = npsSelectedAnswerIds;
        this.f135588h = npsInputAnswerTxt;
        this.f135589i = questionShowTimeMap;
        this.f135590j = zk2Var3;
        this.f135591k = zk2Var4;
        this.f135592l = aVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.pq)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar = (com.tencent.mm.plugin.finder.viewmodel.component.pq) obj;
        return this.f135581a == pqVar.f135581a && this.f135582b == pqVar.f135582b && this.f135583c == pqVar.f135583c && this.f135584d == pqVar.f135584d && kotlin.jvm.internal.o.b(this.f135585e, pqVar.f135585e) && kotlin.jvm.internal.o.b(this.f135586f, pqVar.f135586f) && kotlin.jvm.internal.o.b(this.f135587g, pqVar.f135587g) && kotlin.jvm.internal.o.b(this.f135588h, pqVar.f135588h) && kotlin.jvm.internal.o.b(this.f135589i, pqVar.f135589i) && kotlin.jvm.internal.o.b(this.f135590j, pqVar.f135590j) && kotlin.jvm.internal.o.b(this.f135591k, pqVar.f135591k) && kotlin.jvm.internal.o.b(this.f135592l, pqVar.f135592l);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f135581a.hashCode() * 31) + java.lang.Long.hashCode(this.f135582b)) * 31) + java.lang.Integer.hashCode(this.f135583c)) * 31) + java.lang.Integer.hashCode(this.f135584d)) * 31) + this.f135585e.hashCode()) * 31) + this.f135586f.hashCode()) * 31) + this.f135587g.hashCode()) * 31) + this.f135588h.hashCode()) * 31) + this.f135589i.hashCode()) * 31;
        r45.zk2 zk2Var = this.f135590j;
        int hashCode2 = (hashCode + (zk2Var == null ? 0 : zk2Var.hashCode())) * 31;
        r45.zk2 zk2Var2 = this.f135591k;
        int hashCode3 = (hashCode2 + (zk2Var2 == null ? 0 : zk2Var2.hashCode())) * 31;
        yz5.a aVar = this.f135592l;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "NpsShowInfo(showState=" + this.f135581a + ", startShowTime=" + this.f135582b + ", showCount=" + this.f135583c + ", index=" + this.f135584d + ", shownQuestionIdList=" + this.f135585e + ", selectedAnswerIdList=" + this.f135586f + ", npsSelectedAnswerIds=" + this.f135587g + ", npsInputAnswerTxt=" + this.f135588h + ", questionShowTimeMap=" + this.f135589i + ", showingQuestion=" + this.f135590j + ", prepareQuestion=" + this.f135591k + ", prepareOnPopupEnd=" + this.f135592l + ')';
    }
}
