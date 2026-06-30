package r45;

/* loaded from: classes.dex */
public class ps1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ps1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "game_team_info", r45.fr1.class), com.tencent.mm.protobuf.i.r(3, "play_together_info", r45.yq1.class), com.tencent.mm.protobuf.i.c(4, "not_pass_openid_to_game"));
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
