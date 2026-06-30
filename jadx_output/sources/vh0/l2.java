package vh0;

/* loaded from: classes9.dex */
public abstract class l2 {
    public static int a(int i17) {
        if (i17 < 100) {
            if (i17 == 2) {
                return 3;
            }
            if (i17 == 5) {
                return 6;
            }
            if (i17 == 10) {
                return 8;
            }
            switch (i17) {
                case 12:
                    return 1;
                case 13:
                    return 2;
                case 14:
                    return 4;
                case 15:
                    return 5;
                case 16:
                    return 7;
            }
        }
        if (i17 - 100 == 4) {
            return 11;
        }
        return 0;
    }

    public static int b(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("chat_from_scene", 0);
        if (intExtra == 0) {
            intExtra = intent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0) + 100;
        }
        return a(intExtra);
    }
}
