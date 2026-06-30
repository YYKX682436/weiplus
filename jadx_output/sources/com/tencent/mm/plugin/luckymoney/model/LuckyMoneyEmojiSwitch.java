package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class LuckyMoneyEmojiSwitch implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch> CREATOR = new com.tencent.mm.plugin.luckymoney.model.f1();

    /* renamed from: d, reason: collision with root package name */
    public int f145153d;

    /* renamed from: e, reason: collision with root package name */
    public int f145154e;

    /* renamed from: f, reason: collision with root package name */
    public int f145155f;

    /* renamed from: g, reason: collision with root package name */
    public int f145156g;

    public LuckyMoneyEmojiSwitch() {
        this.f145153d = 0;
        this.f145154e = 0;
        this.f145155f = 0;
        this.f145156g = 0;
    }

    public static com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch();
        luckyMoneyEmojiSwitch.f145153d = jSONObject.optInt("showOpenNormalExpression", 0);
        luckyMoneyEmojiSwitch.f145154e = jSONObject.optInt("showDetailNormalExpression", 0);
        luckyMoneyEmojiSwitch.f145155f = jSONObject.optInt("enableAnswerByExpression", 0);
        luckyMoneyEmojiSwitch.f145156g = jSONObject.optInt("enableAnswerBySelfie", 0);
        return luckyMoneyEmojiSwitch;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "LuckyMoneyEmojiSwitch{showOpenNormalExpression=" + this.f145153d + ", showDetailNormalExpression=" + this.f145154e + ", enalbeAnswerByExpression=" + this.f145155f + ", enableAnswerBySelfie=" + this.f145156g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f145153d);
        parcel.writeInt(this.f145154e);
        parcel.writeInt(this.f145155f);
        parcel.writeInt(this.f145156g);
    }

    public LuckyMoneyEmojiSwitch(android.os.Parcel parcel) {
        this.f145153d = 0;
        this.f145154e = 0;
        this.f145155f = 0;
        this.f145156g = 0;
        this.f145153d = parcel.readInt();
        this.f145154e = parcel.readInt();
        this.f145155f = parcel.readInt();
        this.f145156g = parcel.readInt();
    }
}
