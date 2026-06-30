package gd4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final gd4.c f270635d;

    /* renamed from: e, reason: collision with root package name */
    public static final gd4.c f270636e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ gd4.c[] f270637f;

    static {
        gd4.c cVar = new gd4.c("PLAY", 0);
        f270635d = cVar;
        gd4.c cVar2 = new gd4.c("PAUSE", 1);
        f270636e = cVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayCommand");
        gd4.c[] cVarArr = {cVar, cVar2};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayCommand");
        f270637f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static gd4.c valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayCommand");
        gd4.c cVar = (gd4.c) java.lang.Enum.valueOf(gd4.c.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayCommand");
        return cVar;
    }

    public static gd4.c[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayCommand");
        gd4.c[] cVarArr = (gd4.c[]) f270637f.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayCommand");
        return cVarArr;
    }
}
