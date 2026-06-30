package gd4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final gd4.c f270661a;

    /* renamed from: b, reason: collision with root package name */
    public final n74.a0 f270662b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.a0 f270663c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f270664d;

    public d(gd4.c command, n74.a0 sight, n74.a0 breakSight, android.widget.FrameLayout.LayoutParams layoutParams) {
        kotlin.jvm.internal.o.g(command, "command");
        kotlin.jvm.internal.o.g(sight, "sight");
        kotlin.jvm.internal.o.g(breakSight, "breakSight");
        this.f270661a = command;
        this.f270662b = sight;
        this.f270663c = breakSight;
        this.f270664d = layoutParams;
    }

    public final android.widget.FrameLayout.LayoutParams a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
        return this.f270664d;
    }

    public final gd4.c b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommand", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommand", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
        return this.f270661a;
    }
}
