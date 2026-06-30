package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public abstract class w0 {
    public static com.tencent.mm.plugin.wallet_core.model.Bankcard a(com.tencent.mm.plugin.wallet_core.model.BankcardScene bankcardScene) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard(bankcardScene.M2, bankcardScene.N2, bankcardScene.O2, bankcardScene.P2, bankcardScene.Q2, bankcardScene.R2, bankcardScene.S2, bankcardScene.T2, bankcardScene.U2, bankcardScene.V2, bankcardScene.W2, bankcardScene.X2, bankcardScene.Y2, bankcardScene.Z2, bankcardScene.f179589a3, bankcardScene.f179590b3, bankcardScene.f179591c3, bankcardScene.f179592d3, bankcardScene.f179593e3, bankcardScene.f179594f3, bankcardScene.f179595g3, bankcardScene.f179596h3, bankcardScene.f179597i3, bankcardScene.f179598j3, bankcardScene.f179599k3, bankcardScene.f179600l3, bankcardScene.f179601m3, bankcardScene.f179602n3, bankcardScene.f179603o3, bankcardScene.f179604p3, bankcardScene.f179605q3, bankcardScene.f179606r3, bankcardScene.f179607s3, bankcardScene.f179608t3, bankcardScene.f179609u3);
        bankcard.field_bindSerial = bankcardScene.field_bindSerial;
        bankcard.field_defaultCardState = bankcardScene.field_defaultCardState;
        bankcard.field_cardType = bankcardScene.field_cardType;
        bankcard.field_bankcardState = bankcardScene.field_bankcardState;
        bankcard.field_forbidWord = bankcardScene.field_forbidWord;
        bankcard.field_bankName = bankcardScene.field_bankName;
        bankcard.field_bankcardType = bankcardScene.field_bankcardType;
        bankcard.field_bankcardTypeName = bankcardScene.field_bankcardTypeName;
        bankcard.field_bankcardTag = bankcardScene.field_bankcardTag;
        bankcard.field_bankcardTail = bankcardScene.field_bankcardTail;
        bankcard.field_supportTag = bankcardScene.field_supportTag;
        bankcard.field_mobile = bankcardScene.field_mobile;
        bankcard.field_trueName = bankcardScene.field_trueName;
        bankcard.field_desc = bankcardScene.field_desc;
        bankcard.field_bankPhone = bankcardScene.field_bankPhone;
        bankcard.field_bizUsername = bankcardScene.field_bizUsername;
        bankcard.field_onceQuotaKind = bankcardScene.field_onceQuotaKind;
        bankcard.field_onceQuotaVirtual = bankcardScene.field_onceQuotaVirtual;
        bankcard.field_dayQuotaKind = bankcardScene.field_dayQuotaKind;
        bankcard.field_dayQuotaVirtual = bankcardScene.field_dayQuotaVirtual;
        bankcard.field_fetchArriveTime = bankcardScene.field_fetchArriveTime;
        bankcard.field_fetchArriveTimeWording = bankcardScene.field_fetchArriveTimeWording;
        bankcard.field_repay_url = bankcardScene.field_repay_url;
        bankcard.field_wxcreditState = bankcardScene.field_wxcreditState;
        bankcard.field_bankcardClientType = bankcardScene.field_bankcardClientType;
        bankcard.field_ext_msg = bankcardScene.field_ext_msg;
        bankcard.field_support_micropay = bankcardScene.field_support_micropay;
        bankcard.field_arrive_type = bankcardScene.field_arrive_type;
        bankcard.field_avail_save_wording = bankcardScene.field_avail_save_wording;
        bankcard.field_fetch_charge_rate = bankcardScene.field_fetch_charge_rate;
        bankcard.field_full_fetch_charge_fee = bankcardScene.field_full_fetch_charge_fee;
        bankcard.field_fetch_charge_info = bankcardScene.field_fetch_charge_info;
        bankcard.field_tips = bankcardScene.field_tips;
        bankcard.field_forbid_title = bankcardScene.field_forbid_title;
        bankcard.field_forbid_url = bankcardScene.field_forbid_url;
        bankcard.field_no_micro_word = bankcardScene.field_no_micro_word;
        bankcard.field_card_bottom_wording = bankcardScene.field_card_bottom_wording;
        bankcard.field_support_lqt_turn_in = bankcardScene.field_support_lqt_turn_in;
        bankcard.field_support_lqt_turn_out = bankcardScene.field_support_lqt_turn_out;
        bankcard.field_is_hightlight_pre_arrive_time_wording = bankcardScene.field_is_hightlight_pre_arrive_time_wording;
        bankcard.field_card_state_name = bankcardScene.field_card_state_name;
        bankcard.field_prompt_info_prompt_text = bankcardScene.field_prompt_info_prompt_text;
        bankcard.field_prompt_info_jump_text = bankcardScene.field_prompt_info_jump_text;
        bankcard.field_prompt_info_jump_url = bankcardScene.field_prompt_info_jump_url;
        return bankcard;
    }

    public static com.tencent.mm.plugin.wallet_core.model.BankcardScene b(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        com.tencent.mm.plugin.wallet_core.model.BankcardScene bankcardScene = new com.tencent.mm.plugin.wallet_core.model.BankcardScene(bankcard.I2, bankcard.J2, bankcard.K2, bankcard.L2, bankcard.M2, bankcard.N2, bankcard.O2, bankcard.P2, bankcard.Q2, bankcard.R2, bankcard.S2, bankcard.T2, bankcard.U2, bankcard.V2, bankcard.W2, bankcard.X2, bankcard.Y2, bankcard.Z2, bankcard.f179562a3, bankcard.f179563b3, bankcard.f179564c3, bankcard.f179565d3, bankcard.f179566e3, bankcard.f179567f3, bankcard.f179568g3, bankcard.f179569h3, bankcard.f179570i3, bankcard.f179571j3, bankcard.f179572k3, bankcard.f179573l3, bankcard.f179574m3, bankcard.f179575n3, bankcard.f179576o3, bankcard.f179577p3, bankcard.f179578q3);
        bankcardScene.field_bindSerial = bankcard.field_bindSerial;
        bankcardScene.field_defaultCardState = bankcard.field_defaultCardState;
        bankcardScene.field_cardType = bankcard.field_cardType;
        bankcardScene.field_bankcardState = bankcard.field_bankcardState;
        bankcardScene.field_forbidWord = bankcard.field_forbidWord;
        bankcardScene.field_bankName = bankcard.field_bankName;
        bankcardScene.field_bankcardType = bankcard.field_bankcardType;
        bankcardScene.field_bankcardTypeName = bankcard.field_bankcardTypeName;
        bankcardScene.field_bankcardTag = bankcard.field_bankcardTag;
        bankcardScene.field_bankcardTail = bankcard.field_bankcardTail;
        bankcardScene.field_supportTag = bankcard.field_supportTag;
        bankcardScene.field_mobile = bankcard.field_mobile;
        bankcardScene.field_trueName = bankcard.field_trueName;
        bankcardScene.field_desc = bankcard.field_desc;
        bankcardScene.field_bankPhone = bankcard.field_bankPhone;
        bankcardScene.field_bizUsername = bankcard.field_bizUsername;
        bankcardScene.field_onceQuotaKind = bankcard.field_onceQuotaKind;
        bankcardScene.field_onceQuotaVirtual = bankcard.field_onceQuotaVirtual;
        bankcardScene.field_dayQuotaKind = bankcard.field_dayQuotaKind;
        bankcardScene.field_dayQuotaVirtual = bankcard.field_dayQuotaVirtual;
        bankcardScene.field_fetchArriveTime = bankcard.field_fetchArriveTime;
        bankcardScene.field_fetchArriveTimeWording = bankcard.field_fetchArriveTimeWording;
        bankcardScene.field_repay_url = bankcard.field_repay_url;
        bankcardScene.field_wxcreditState = bankcard.field_wxcreditState;
        bankcardScene.field_bankcardClientType = bankcard.field_bankcardClientType;
        bankcardScene.field_ext_msg = bankcard.field_ext_msg;
        bankcardScene.field_support_micropay = bankcard.field_support_micropay;
        bankcardScene.field_arrive_type = bankcard.field_arrive_type;
        bankcardScene.field_avail_save_wording = bankcard.field_avail_save_wording;
        bankcardScene.field_fetch_charge_rate = bankcard.field_fetch_charge_rate;
        bankcardScene.field_full_fetch_charge_fee = bankcard.field_full_fetch_charge_fee;
        bankcardScene.field_fetch_charge_info = bankcard.field_fetch_charge_info;
        bankcardScene.field_tips = bankcard.field_tips;
        bankcardScene.field_forbid_title = bankcard.field_forbid_title;
        bankcardScene.field_forbid_url = bankcard.field_forbid_url;
        bankcardScene.field_no_micro_word = bankcard.field_no_micro_word;
        bankcardScene.field_card_bottom_wording = bankcard.field_card_bottom_wording;
        bankcardScene.field_support_lqt_turn_in = bankcard.field_support_lqt_turn_in;
        bankcardScene.field_support_lqt_turn_out = bankcard.field_support_lqt_turn_out;
        bankcardScene.field_is_hightlight_pre_arrive_time_wording = bankcard.field_is_hightlight_pre_arrive_time_wording;
        bankcardScene.field_card_state_name = bankcard.field_card_state_name;
        bankcardScene.field_prompt_info_prompt_text = bankcard.field_prompt_info_prompt_text;
        bankcardScene.field_prompt_info_jump_text = bankcard.field_prompt_info_jump_text;
        bankcardScene.field_prompt_info_jump_url = bankcard.field_prompt_info_jump_url;
        return bankcardScene;
    }

    public static java.util.ArrayList c(int i17) {
        java.util.ArrayList arrayList;
        dt4.c Ni = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni();
        Ni.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from WalletBankcardScene where (cardType <= 7 OR cardType & 256 != 0 OR cardType & 128 != 0) and scene=");
        l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.BankcardScene.f179588v3;
        sb6.append(i17);
        android.database.Cursor f17 = Ni.f243231d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            arrayList = null;
        } else {
            if (f17.moveToFirst()) {
                arrayList = new java.util.ArrayList();
                do {
                    com.tencent.mm.plugin.wallet_core.model.BankcardScene bankcardScene = new com.tencent.mm.plugin.wallet_core.model.BankcardScene();
                    bankcardScene.convertFrom(f17);
                    arrayList.add(bankcardScene);
                } while (f17.moveToNext());
            } else {
                arrayList = null;
            }
            f17.close();
        }
        if (arrayList == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((com.tencent.mm.plugin.wallet_core.model.BankcardScene) it.next()));
        }
        return arrayList2;
    }

    public static boolean d(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, int i17) {
        if (bankcard == null) {
            return false;
        }
        if (i17 != 8 && i17 != 12 && i17 != 26) {
            return ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().insert(bankcard);
        }
        com.tencent.mm.plugin.wallet_core.model.BankcardScene b17 = b(bankcard);
        b17.field_scene = i17;
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni().insert(b17);
    }

    public static boolean e(java.util.List list, int i17) {
        if (list == null) {
            return false;
        }
        if (i17 != 8 && i17 != 12 && i17 != 26) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().D0(list);
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.BankcardScene b17 = b((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
            b17.field_scene = i17;
            arrayList.add(b17);
        }
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni().z0(arrayList);
        return true;
    }
}
