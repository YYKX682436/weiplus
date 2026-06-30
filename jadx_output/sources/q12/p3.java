package q12;

/* loaded from: classes12.dex */
public class p3 extends com.tencent.mm.sdk.event.n {
    public p3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        switch (((com.tencent.mm.autogen.events.GifErrorCodeEvent) iEvent).f54422g.f8377a) {
            case 101:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 3L, 1L, false);
                return false;
            case 102:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 4L, 1L, false);
                return false;
            case 103:
            default:
                return false;
            case 104:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 6L, 1L, false);
                return false;
            case 105:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 7L, 1L, false);
                return false;
            case 106:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 8L, 1L, false);
                return false;
            case 107:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 9L, 1L, false);
                return false;
            case 108:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 10L, 1L, false);
                return false;
            case 109:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 11L, 1L, false);
                return false;
            case 110:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 12L, 1L, false);
                return false;
            case 111:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 13L, 1L, false);
                return false;
            case 112:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 14L, 1L, false);
                return false;
            case 113:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 15L, 1L, false);
                return false;
        }
    }
}
