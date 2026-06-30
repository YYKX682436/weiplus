package r45;

/* loaded from: classes2.dex */
public class mx2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public mx2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.u(4, "history_head_wording"), com.tencent.mm.protobuf.i.u(5, "history_end_wording"), com.tencent.mm.protobuf.i.i(6, "ret_flag"), com.tencent.mm.protobuf.i.i(7, "needClear"), com.tencent.mm.protobuf.i.i(8, "getHistoryNow"), com.tencent.mm.protobuf.i.i(9, "prefetch_last_feed_count"), com.tencent.mm.protobuf.i.r(10, "preloadInfo", r45.sq2.class), com.tencent.mm.protobuf.i.r(11, "finderContactRecommend", r45.nz0.class), com.tencent.mm.protobuf.i.i(12, "forceChangePrefetchResult"), com.tencent.mm.protobuf.i.s(13, "liveObjects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.r(14, "finderTopicRecommends", r45.s03.class), com.tencent.mm.protobuf.i.r(15, "finderCategoryRecommends", r45.lw0.class), com.tencent.mm.protobuf.i.u(16, "curLocation"), com.tencent.mm.protobuf.i.r(17, "sectionInfo", r45.xu2.class), com.tencent.mm.protobuf.i.r(18, "interval_conf", r45.fx2.class), com.tencent.mm.protobuf.i.r(19, "layoutInfo", r45.bx2.class), com.tencent.mm.protobuf.i.u(20, "oob"), com.tencent.mm.protobuf.i.r(21, "live_preload_info", r45.l42.class), com.tencent.mm.protobuf.i.a(22, "debug_message"), com.tencent.mm.protobuf.i.u(23, "lbs_city_name"), com.tencent.mm.protobuf.i.i(24, "continue_flag"), com.tencent.mm.protobuf.i.r(25, "tips_show_info", r45.px2.class), com.tencent.mm.protobuf.i.i(26, "flow_card_prefetch_last_feed_count"), com.tencent.mm.protobuf.i.r(27, "recommend_tips", r45.gx2.class), com.tencent.mm.protobuf.i.r(28, "related_recommend_tips", r45.jt2.class), com.tencent.mm.protobuf.i.r(29, "often_read_bar", r45.ex2.class), com.tencent.mm.protobuf.i.r(30, "backup_info", r45.of6.class), com.tencent.mm.protobuf.i.r(31, "stream_ext_context", r45.rf6.class), com.tencent.mm.protobuf.i.r(32, "listen_info", r45.cx2.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
