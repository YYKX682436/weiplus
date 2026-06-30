package zd2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f471593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f471594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f471595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f471596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f471597h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471598i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.aiassistant.tools.LotteryCreateParams f471599m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.q qVar, android.app.Activity activity, long j17, long j18, byte[] bArr, java.lang.String str, com.tencent.mm.plugin.finder.live.aiassistant.tools.LotteryCreateParams lotteryCreateParams, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471593d = qVar;
        this.f471594e = activity;
        this.f471595f = j17;
        this.f471596g = j18;
        this.f471597h = bArr;
        this.f471598i = str;
        this.f471599m = lotteryCreateParams;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd2.c(this.f471593d, this.f471594e, this.f471595f, this.f471596g, this.f471597h, this.f471598i, this.f471599m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zd2.c cVar = (zd2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.q qVar = this.f471593d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = "lottery_" + java.lang.System.currentTimeMillis();
        try {
            zd2.d.f471601b.put(str, qVar);
            android.content.Intent intent = new android.content.Intent();
            long j17 = this.f471595f;
            long j18 = this.f471596g;
            byte[] bArr = this.f471597h;
            java.lang.String str2 = this.f471598i;
            com.tencent.mm.plugin.finder.live.aiassistant.tools.LotteryCreateParams lotteryCreateParams = this.f471599m;
            intent.putExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
            intent.putExtra("KEY_PARAMS_LIVE_ID", j17);
            intent.putExtra("KEY_PARAMS_OBJECT_ID", j18);
            intent.putExtra("KEY_PARAMS_NONCE_ID", bArr);
            intent.putExtra("KEY_PARAMS_ANCHOR_USERNAME", str2);
            intent.putExtra("ai_prefill_request_id", str);
            intent.putExtra("ai_prefill_prize_type", lotteryCreateParams.prizeType);
            intent.putExtra("ai_prefill_winner_count", lotteryCreateParams.winnerCount);
            intent.putExtra("ai_prefill_attend_type", lotteryCreateParams.attendType);
            intent.putExtra("ai_prefill_allow_repeat_win", lotteryCreateParams.allowRepeatWin);
            java.lang.Integer num = lotteryCreateParams.durationMinutes;
            if (num != null) {
                intent.putExtra("ai_prefill_duration_minutes", num.intValue());
            }
            java.lang.String str3 = lotteryCreateParams.attendComment;
            if (str3 != null) {
                intent.putExtra("ai_prefill_attend_comment", str3);
            }
            java.lang.String str4 = lotteryCreateParams.lotteryDescription;
            if (str4 != null) {
                intent.putExtra("ai_prefill_lottery_description", str4);
            }
            java.lang.Integer num2 = lotteryCreateParams.claimType;
            if (num2 != null) {
                intent.putExtra("ai_prefill_claim_type", num2.intValue());
            }
            java.lang.String str5 = lotteryCreateParams.claimRemindWording;
            if (str5 != null) {
                intent.putExtra("ai_prefill_claim_remind_wording", str5);
            }
            java.lang.Integer num3 = lotteryCreateParams.giftDistributeType;
            if (num3 != null) {
                intent.putExtra("ai_prefill_gift_distribute_type", num3.intValue());
            }
            java.util.List<?> list = lotteryCreateParams.giftItems;
            if (list != null) {
                intent.putExtra("ai_prefill_gift_items", zd2.d.d(zd2.d.f471600a, list));
            }
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).sj(this.f471594e, intent, 1002);
            com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: page opened, waiting for prefill result, requestId=" + str);
        } catch (java.lang.Exception e17) {
            zd2.d.f471601b.remove(str);
            com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: failed: " + e17.getMessage());
            qVar.invoke(java.lang.Boolean.FALSE, "{\"error\":\"" + e17.getMessage() + "\"}", new java.lang.Integer(1006));
        }
        return jz5.f0.f302826a;
    }
}
