package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes15.dex */
public class VoiceInputBehavior extends com.tencent.mm.protobuf.f {
    public int cancel;
    public int chooseArea;
    public int chooseCantonese;
    public int clear;
    public int click;
    public int fail;
    public int fullScreenVoiceLongClick;
    public long fullScreenVoiceLongClickTime;
    public long initChoose;
    public int longClick;
    public long longClickTime;
    public int send;
    public int setDefaultLanguage;
    public int setSwitchCantonese;
    public int setlanguage;
    public int showInit;
    public int smileIconClick;
    public int textChangeCount;
    public int textChangeReturn;
    public long textChangeTime;
    public int textClick;
    public int voiceIconClick;
    public long voiceInputTime;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = (com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.cancel), java.lang.Integer.valueOf(voiceInputBehavior.cancel)) && n51.f.a(java.lang.Integer.valueOf(this.send), java.lang.Integer.valueOf(voiceInputBehavior.send)) && n51.f.a(java.lang.Integer.valueOf(this.click), java.lang.Integer.valueOf(voiceInputBehavior.click)) && n51.f.a(java.lang.Integer.valueOf(this.longClick), java.lang.Integer.valueOf(voiceInputBehavior.longClick)) && n51.f.a(java.lang.Long.valueOf(this.longClickTime), java.lang.Long.valueOf(voiceInputBehavior.longClickTime)) && n51.f.a(java.lang.Integer.valueOf(this.textClick), java.lang.Integer.valueOf(voiceInputBehavior.textClick)) && n51.f.a(java.lang.Integer.valueOf(this.textChangeCount), java.lang.Integer.valueOf(voiceInputBehavior.textChangeCount)) && n51.f.a(java.lang.Long.valueOf(this.textChangeTime), java.lang.Long.valueOf(voiceInputBehavior.textChangeTime)) && n51.f.a(java.lang.Integer.valueOf(this.textChangeReturn), java.lang.Integer.valueOf(voiceInputBehavior.textChangeReturn)) && n51.f.a(java.lang.Long.valueOf(this.voiceInputTime), java.lang.Long.valueOf(voiceInputBehavior.voiceInputTime)) && n51.f.a(java.lang.Integer.valueOf(this.fail), java.lang.Integer.valueOf(voiceInputBehavior.fail)) && n51.f.a(java.lang.Integer.valueOf(this.clear), java.lang.Integer.valueOf(voiceInputBehavior.clear)) && n51.f.a(java.lang.Integer.valueOf(this.smileIconClick), java.lang.Integer.valueOf(voiceInputBehavior.smileIconClick)) && n51.f.a(java.lang.Integer.valueOf(this.voiceIconClick), java.lang.Integer.valueOf(voiceInputBehavior.voiceIconClick)) && n51.f.a(java.lang.Integer.valueOf(this.fullScreenVoiceLongClick), java.lang.Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick)) && n51.f.a(java.lang.Long.valueOf(this.fullScreenVoiceLongClickTime), java.lang.Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime)) && n51.f.a(java.lang.Integer.valueOf(this.showInit), java.lang.Integer.valueOf(voiceInputBehavior.showInit)) && n51.f.a(java.lang.Long.valueOf(this.initChoose), java.lang.Long.valueOf(voiceInputBehavior.initChoose)) && n51.f.a(java.lang.Integer.valueOf(this.chooseArea), java.lang.Integer.valueOf(voiceInputBehavior.chooseArea)) && n51.f.a(java.lang.Integer.valueOf(this.chooseCantonese), java.lang.Integer.valueOf(voiceInputBehavior.chooseCantonese)) && n51.f.a(java.lang.Integer.valueOf(this.setlanguage), java.lang.Integer.valueOf(voiceInputBehavior.setlanguage)) && n51.f.a(java.lang.Integer.valueOf(this.setSwitchCantonese), java.lang.Integer.valueOf(voiceInputBehavior.setSwitchCantonese)) && n51.f.a(java.lang.Integer.valueOf(this.setDefaultLanguage), java.lang.Integer.valueOf(voiceInputBehavior.setDefaultLanguage));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.cancel);
            fVar.e(2, this.send);
            fVar.e(3, this.click);
            fVar.e(4, this.longClick);
            fVar.h(5, this.longClickTime);
            fVar.e(6, this.textClick);
            fVar.e(7, this.textChangeCount);
            fVar.h(8, this.textChangeTime);
            fVar.e(9, this.textChangeReturn);
            fVar.h(10, this.voiceInputTime);
            fVar.e(11, this.fail);
            fVar.e(12, this.clear);
            fVar.e(13, this.smileIconClick);
            fVar.e(14, this.voiceIconClick);
            fVar.e(15, this.fullScreenVoiceLongClick);
            fVar.h(16, this.fullScreenVoiceLongClickTime);
            fVar.e(17, this.showInit);
            fVar.h(18, this.initChoose);
            fVar.e(19, this.chooseArea);
            fVar.e(20, this.chooseCantonese);
            fVar.e(21, this.setlanguage);
            fVar.e(22, this.setSwitchCantonese);
            fVar.e(23, this.setDefaultLanguage);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.cancel) + 0 + b36.f.e(2, this.send) + b36.f.e(3, this.click) + b36.f.e(4, this.longClick) + b36.f.h(5, this.longClickTime) + b36.f.e(6, this.textClick) + b36.f.e(7, this.textChangeCount) + b36.f.h(8, this.textChangeTime) + b36.f.e(9, this.textChangeReturn) + b36.f.h(10, this.voiceInputTime) + b36.f.e(11, this.fail) + b36.f.e(12, this.clear) + b36.f.e(13, this.smileIconClick) + b36.f.e(14, this.voiceIconClick) + b36.f.e(15, this.fullScreenVoiceLongClick) + b36.f.h(16, this.fullScreenVoiceLongClickTime) + b36.f.e(17, this.showInit) + b36.f.h(18, this.initChoose) + b36.f.e(19, this.chooseArea) + b36.f.e(20, this.chooseCantonese) + b36.f.e(21, this.setlanguage) + b36.f.e(22, this.setSwitchCantonese) + b36.f.e(23, this.setDefaultLanguage);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = (com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                voiceInputBehavior.cancel = aVar2.g(intValue);
                return 0;
            case 2:
                voiceInputBehavior.send = aVar2.g(intValue);
                return 0;
            case 3:
                voiceInputBehavior.click = aVar2.g(intValue);
                return 0;
            case 4:
                voiceInputBehavior.longClick = aVar2.g(intValue);
                return 0;
            case 5:
                voiceInputBehavior.longClickTime = aVar2.i(intValue);
                return 0;
            case 6:
                voiceInputBehavior.textClick = aVar2.g(intValue);
                return 0;
            case 7:
                voiceInputBehavior.textChangeCount = aVar2.g(intValue);
                return 0;
            case 8:
                voiceInputBehavior.textChangeTime = aVar2.i(intValue);
                return 0;
            case 9:
                voiceInputBehavior.textChangeReturn = aVar2.g(intValue);
                return 0;
            case 10:
                voiceInputBehavior.voiceInputTime = aVar2.i(intValue);
                return 0;
            case 11:
                voiceInputBehavior.fail = aVar2.g(intValue);
                return 0;
            case 12:
                voiceInputBehavior.clear = aVar2.g(intValue);
                return 0;
            case 13:
                voiceInputBehavior.smileIconClick = aVar2.g(intValue);
                return 0;
            case 14:
                voiceInputBehavior.voiceIconClick = aVar2.g(intValue);
                return 0;
            case 15:
                voiceInputBehavior.fullScreenVoiceLongClick = aVar2.g(intValue);
                return 0;
            case 16:
                voiceInputBehavior.fullScreenVoiceLongClickTime = aVar2.i(intValue);
                return 0;
            case 17:
                voiceInputBehavior.showInit = aVar2.g(intValue);
                return 0;
            case 18:
                voiceInputBehavior.initChoose = aVar2.i(intValue);
                return 0;
            case 19:
                voiceInputBehavior.chooseArea = aVar2.g(intValue);
                return 0;
            case 20:
                voiceInputBehavior.chooseCantonese = aVar2.g(intValue);
                return 0;
            case 21:
                voiceInputBehavior.setlanguage = aVar2.g(intValue);
                return 0;
            case 22:
                voiceInputBehavior.setSwitchCantonese = aVar2.g(intValue);
                return 0;
            case 23:
                voiceInputBehavior.setDefaultLanguage = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
