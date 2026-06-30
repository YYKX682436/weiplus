package r45;

/* loaded from: classes.dex */
public class nv4 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public nv4() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.s(6, "newlife_tab_list", r45.pv4.class), com.tencent.mm.protobuf.i.r(7, "prefetch_conf", r45.gv4.class), com.tencent.mm.protobuf.i.u(9, "debug_message"), com.tencent.mm.protobuf.i.r(10, "search_result", r45.lv4.class), com.tencent.mm.protobuf.i.r(11, "top_bar_post_guide", r45.cv4.class), com.tencent.mm.protobuf.i.r(12, "post_education_page", r45.bv4.class), com.tencent.mm.protobuf.i.i(13, "stream_show_type"), com.tencent.mm.protobuf.i.r(14, "tag_folded_stream", r45.rv4.class), com.tencent.mm.protobuf.i.r(15, "tag_relateded_stream", r45.sv4.class), com.tencent.mm.protobuf.i.r(16, "user_tag_stream", r45.uv4.class));
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
